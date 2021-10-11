package com.Proiect.ProiectFinal.controllers;

import com.Proiect.ProiectFinal.models.Entries;
import com.Proiect.ProiectFinal.repo.EntriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller2 {

    @Autowired
    private EntriesRepository entriesRepository;

    @GetMapping("/home")
    public String home(Model model) {
        Iterable<Entries> entries = entriesRepository.findAll();
        model.addAttribute("entries", entries);
        return "home";
    }
}
