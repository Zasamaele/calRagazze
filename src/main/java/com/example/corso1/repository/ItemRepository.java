package com.example.corso1.repository;

import com.example.corso1.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository <Item, Integer> {
}
