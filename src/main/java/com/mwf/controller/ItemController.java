package com.mwf.controller;

import com.mwf.dto.ItemDTO;
import com.mwf.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")

public class ItemController {

    private final ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @PostMapping("/saveTouristsInfo")
    public void saveTouristsInfo(@RequestBody ItemDTO touristsDTO) {
        itemService.saveTouristsInfo(touristsDTO);
       }

}
