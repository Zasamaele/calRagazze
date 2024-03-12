package com.example.corso1.controller;

import com.example.corso1.entity.Ragazze;
import com.example.corso1.repository.RagazzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping ("/rest/ragazze")
@CrossOrigin (origins = "*")
public class RagazzeController {
    @Autowired
    private RagazzaRepository ragazzeService;

    @GetMapping (path = "/")
    public List<Ragazze> ragazze(){
        List<Ragazze> listaRagazze = new ArrayList<>();
        Iterable<Ragazze> iterable =ragazzeService.findAll();
        iterable.forEach(
                r -> {
                    listaRagazze.add(r);
                }
        );

        return  listaRagazze;
    }
}
