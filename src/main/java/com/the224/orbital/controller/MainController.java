package com.the224.orbital.controller;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"http://127.0.0.1:3000", "http://localhost:3000"})
@RestController
public class MainController {

    public MainController() { }

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}









