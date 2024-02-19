package com.gestion.compte.gestiondescomptes.controleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comptes")

public class controleur {
    @GetMapping

    public String getString() {
        return "hello word";
    }
}








