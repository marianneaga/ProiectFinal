package com.Proiect.ProiectFinal.controllers;

import com.Proiect.ProiectFinal.models.Entry;
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
    public String Home(Model model) {
        Entry entry = new Entry();
        entry.setTitle("Hello");
        entry.setResult("ABC");
        entriesRepository.save(entry);
        Iterable<Entry> entries = entriesRepository.findAll();
        model.addAttribute("entries", entries);
        return "home";
    }

    @GetMapping("/about")
    public String About(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }

    @GetMapping("/createaccount")
    public String CreateAccount(Model model) {
        model.addAttribute("title", "Create Account");
        return "Create Account";
    }
}
