package com.javazone.deployToEc2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUserDetails(@RequestParam String name){
        return name+" You are onboarded !! ";
    }
}
