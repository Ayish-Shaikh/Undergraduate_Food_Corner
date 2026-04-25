package com.undergraduate.cloud_food_corner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/api")
    public String home(){
        return "home";
    }
}
