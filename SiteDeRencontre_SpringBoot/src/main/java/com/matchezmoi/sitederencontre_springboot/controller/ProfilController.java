package com.matchezmoi.sitederencontre_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProfilController {
    @GetMapping("profil")
    public String pageProfil (){
        return "Profil";
    }

    @GetMapping("profil_modifier")
    public String pageProfilModifier (){
        return "Profil_modifier";
    }
}
