package com.itvillage.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicApis {

    @GetMapping("public")
    public String getStatus()
    {
        return "Rest API is't Authenticate";
    }

    @GetMapping("user")
    public String getUsers()
    {
        return "Rest API is't Authenticate";
    }
}
