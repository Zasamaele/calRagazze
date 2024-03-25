package com.example.corso1.repository;

import com.example.corso1.entity.Character_data;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character_data, Integer> {

}
