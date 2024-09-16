package com.mwf.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.NClob;

@Data
@Entity
@Table(name = "ItemTable")
public class ItemEntity {
    @Id
    @SequenceGenerator(name = "Item_id",sequenceName = "Item_id",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Item_id")
    int id;
    private String name;
    private String category;
    private double cost;
    private double sellingPrice;
    private int quantity;
    private NClob image;
}
