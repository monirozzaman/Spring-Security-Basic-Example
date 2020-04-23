package com.itvillage.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateApis {

    @GetMapping("private")
    public String getStatus()
    {
        return "User is Authenticate";
    }

}
