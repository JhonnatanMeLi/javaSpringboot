package com.example.demo.controllers;

import com.example.demo.services.ConversorRomanos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversor")
public class ConversorController {

    @Autowired
    private ConversorRomanos conversorRomanos;

    @GetMapping("/numero-romano")
    public String conversorIntARomano(@RequestParam Integer numero) {
        return conversorRomanos.convertirARomano(numero);
    }

    @GetMapping("/romano-numero")
    public Integer conversorRomanoAInt(@RequestParam String romano) {
        return conversorRomanos.convertirANumero(romano);
    }

}
