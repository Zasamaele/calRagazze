package com.example.corso1.controller;

import com.example.corso1.entity.Skills;
import com.example.corso1.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/rest")
@CrossOrigin( origins = "*")
public class SkillController {
    @Autowired
    private SkillsRepository skillsService;

    @GetMapping (path = "/skills")
    public List<Skills> skills(){
        List<Skills> listaSkill = new ArrayList<>();
        Iterable <Skills> iterable = skillsService.findAll();
        iterable.forEach(
                r ->{
                    listaSkill.add(r);
                }
        );
        return listaSkill;
    }


}
