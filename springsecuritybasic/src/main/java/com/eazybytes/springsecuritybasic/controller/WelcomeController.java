package com.eazybytes.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

   @GetMapping("/welcome")
    public String sayWelcome(){
        return "Você só acessa isso por que foi aprovado numa instância de segurança Spring!";

    }
}
