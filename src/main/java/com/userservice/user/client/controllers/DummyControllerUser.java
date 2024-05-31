package com.userservice.user.client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerUser {

    @GetMapping("/users")
    public String doSomething(){
        System.out.println("request recieved at user service");
        return "Hello, From User service";
    }


}
