package com.example.corso1.controller;


import com.example.corso1.entity.Character;
import com.example.corso1.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/rest/character")
@CrossOrigin (origins = "*")
public class CharacterController {
    @Autowired
    private CharacterRepository characterService;

    @GetMapping(path = "/")
    public List<Character> characters() {
        List<Character> listCharacter = new ArrayList<>();
        Iterable<Character> iterable = characterService.findAll();
        iterable.forEach(
                r -> {
                    listCharacter.add(r);
                }
        );
        return listCharacter;
    }
}
