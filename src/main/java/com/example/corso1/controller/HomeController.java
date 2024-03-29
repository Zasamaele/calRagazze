

package com.example.corso1.controller;

import com.example.corso1.dto.SommaDTO;
import com.example.corso1.entity.Ragazze;
import com.example.corso1.repository.RagazzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {
    @Autowired
    private RagazzaRepository ragazzaRepository;

    @GetMapping(path = "ragazze")
    public String ragazzeEndPoint() {
        Iterable<Ragazze> ragazzeList = ragazzaRepository.findAll();
           AtomicInteger counter = new AtomicInteger();
          ragazzeList.forEach(
                  ragazza -> {
                     System.out.println(ragazza.getName());
                      counter.getAndIncrement();
                  }
          );
          return "<h1> ci sono " + counter + " ragazze nel bordello </h1> ";
    }

   // @GetMapping (path = )
    @PostMapping(path = "somma")
    public int somma(@RequestBody SommaDTO dto) {
        return (dto.getX() + dto.getY());
    }

    @GetMapping(path = "info")
    public String info() {
        return "info su pc";
    }

    //@GetMapping (path =  "infoIp")


}
