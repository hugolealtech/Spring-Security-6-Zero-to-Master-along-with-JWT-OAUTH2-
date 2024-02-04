package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NoticeController {
    @GetMapping("/myNotices")

    public String getAccountDetails () {return  "Here are the Notice details from the DB";
    }
}
