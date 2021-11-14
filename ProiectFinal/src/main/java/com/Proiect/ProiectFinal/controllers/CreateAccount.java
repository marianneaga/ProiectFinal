package com.Proiect.ProiectFinal.controllers;

import com.Proiect.ProiectFinal.models.Entry;
import com.Proiect.ProiectFinal.repository.EntriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateAccount {

    @Autowired
    private EntriesRepository entriesRepository;

    @GetMapping("/register")
    public String CreateAccount(Model model) {
        model.addAttribute("title", "Create Account");
        Entry entry = new Entry();
        entry.setTitle("Hello");
        entry.setResult("ABC");
        entriesRepository.save(entry);
        Iterable<Entry> entries = entriesRepository.findAll();
        model.addAttribute("entries", entries);

        return "create_account";
    }
}
