package com.Proiect.ProiectFinal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller2 {

    @GetMapping("/home")
    public String home1(Model model) {
        return "home";
    }
}
