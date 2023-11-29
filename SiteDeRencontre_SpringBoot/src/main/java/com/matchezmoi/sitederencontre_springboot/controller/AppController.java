package com.matchezmoi.sitederencontre_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("")
    public String pageIndex (){
        return "index";
    }
}
