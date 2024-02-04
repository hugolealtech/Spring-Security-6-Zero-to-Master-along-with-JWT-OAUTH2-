package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LinkedInHugoController {
    @GetMapping("/myLinkedIn")

    public String getAccountDetails () {return  "If you`re seeing this it is because I studing a course just in english and it is the first one I`ve tried to do this madness, but I geting better and this is my legacy!";

    }
}