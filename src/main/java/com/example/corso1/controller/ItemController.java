package com.example.corso1.controller;

import com.example.corso1.entity.Item;
import com.example.corso1.repository.ItemRepository;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.apache.el.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/rest/item")
@CrossOrigin(origins = "*")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(path = "/all_item")
    public List<Item> items() {
        List<Item> itemList = new ArrayList<>();
        Iterable<Item> iterable = itemRepository.findAll();
        iterable.forEach(
                r -> {
                    itemList.add(r);
                }
        );
        return itemList;
    }
    @GetMapping(path = "item")
    public Optional<Item> find (@RequestParam int id){
        Optional<Item> item = itemRepository.findById(id);
        return  item;
    }
}

