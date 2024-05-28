package com.userservice.user.client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerUser {

    @GetMapping("/hello")
    public String doSomething(){
        System.out.println("request recieved");
        return "Hello";
    }
}
