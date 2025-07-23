package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Hello world"; // This will resolve to a view named 'home.html'
    }
}
