package com.example.corso1.controller;


import com.example.corso1.entity.Character_data;
import com.example.corso1.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/rest/character")
@CrossOrigin (origins = "*")
public class CharacterController {
    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping(path = "/find_all")
    public List<Character_data> characters() {
        List<Character_data> listCharacter = new ArrayList<>();
        Iterable<Character_data> iterable = characterRepository.findAll();
        iterable.forEach(
                r -> {
                    listCharacter.add(r);
                }
        );
        return listCharacter;
    }

    @GetMapping (path = "/find")
    public Optional<Character_data> find(@RequestParam int id){
        Optional<Character_data> character = characterRepository.findById(id);
        return character;
    }
}
