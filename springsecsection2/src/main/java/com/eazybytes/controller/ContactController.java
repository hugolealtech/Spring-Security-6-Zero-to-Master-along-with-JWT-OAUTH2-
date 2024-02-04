package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ContactController {
    @RequestMapping("/myContact")

    public String getAccountDetails () {return  "Here are the Contact details from the DB";
    }
}
