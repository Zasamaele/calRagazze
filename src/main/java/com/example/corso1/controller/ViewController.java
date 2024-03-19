package com.example.corso1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ViewController {
    // in questa sincrona
    @GetMapping (path = "index" )
    public String index () {
        return "index2";
    }

    //asincrona
    @GetMapping ( path = "well")
    public String welkome () { return  "welkome";}

    @GetMapping (path = "lista_personaggi")
    public String lista_personaggi () {return "character_home";}
}
