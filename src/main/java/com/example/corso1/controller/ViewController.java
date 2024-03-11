package com.example.corso1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.Path;

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

}
