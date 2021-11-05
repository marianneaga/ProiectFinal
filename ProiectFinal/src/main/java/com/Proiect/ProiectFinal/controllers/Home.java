package com.Proiect.ProiectFinal.controllers;

import com.Proiect.ProiectFinal.models.Entry;
import com.Proiect.ProiectFinal.repository.EntriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/home")
    public String Home(Model model) {
        return "home";
    }
}
