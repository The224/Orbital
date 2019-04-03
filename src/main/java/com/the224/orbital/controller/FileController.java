package com.the224.orbital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}