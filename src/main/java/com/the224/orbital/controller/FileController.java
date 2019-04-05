package com.the224.orbital.controller;

import com.the224.orbital.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = {"http://127.0.0.1:3000", "http://localhost:3000"})
@RestController
public class FileController {

    @Autowired private FileService fileService;


    public FileController() {




        System.out.println("Wuuut");
    }

    @GetMapping("/test")
    public String home() {
        return "Spring boot server is working";
    }


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public void login(@RequestParam Map<String,String> params) {
        System.out.println(params.toString());
    }


    @RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
    public void logout() {
        System.out.println("Logout");
    }

}









