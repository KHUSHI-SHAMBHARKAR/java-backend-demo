package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping(path="/api/v1/hello")
    public String Hello(){
        return "Hello World!";
    }
}
