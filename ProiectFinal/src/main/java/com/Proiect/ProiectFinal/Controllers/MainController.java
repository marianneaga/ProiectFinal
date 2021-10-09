package com.Proiect.ProiectFinal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home Page");
        return "mainpage";
    }
    @GetMapping("/about")
    public String About(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }
}
