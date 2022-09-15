package com.entrega2ej1.obrestejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Saludo del entrega2/ejercicio";
    }
}
