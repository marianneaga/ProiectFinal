package com.Proiect.ProiectFinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("/sign_in")
    public String SignIn(Model model) {
        return "sign_in";
    }
}
