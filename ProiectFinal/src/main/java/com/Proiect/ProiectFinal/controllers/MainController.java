package com.Proiect.ProiectFinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String Welcome(Model model) {
        model.addAttribute("title", "Welcome !");
        return "main_page";
    }
}
