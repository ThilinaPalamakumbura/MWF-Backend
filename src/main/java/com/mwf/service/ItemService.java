package com.mwf.service;

import com.mwf.dto.ItemDTO;
import com.mwf.entity.ItemEntity;
import com.mwf.repository.ItemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    @Autowired
    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }
    public void saveTouristsInfo(ItemDTO touristsDTO) {
        ItemEntity itemEntity = new ItemEntity();
        BeanUtils.copyProperties(touristsDTO, itemEntity);
        System.out.println(itemEntity);
        itemRepository.save(itemEntity);
    }
}
