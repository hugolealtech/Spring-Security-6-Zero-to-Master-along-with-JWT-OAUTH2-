package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LinkedInHugoController {
    @GetMapping("/myLinkedIn")

    public String getAccountDetails () {return  "If you're seeing this, it's because I'm studying a course just in English, and this is the first time I've tried to do this madness, but I'm getting better, and this is part of my legacy.";

    }
}