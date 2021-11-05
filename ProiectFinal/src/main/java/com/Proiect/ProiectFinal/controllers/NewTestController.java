package com.Proiect.ProiectFinal.controllers;

import com.Proiect.ProiectFinal.models.Test;
import com.Proiect.ProiectFinal.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class NewTestController {

        @Autowired
        private DataService dataService;

        @GetMapping("/new_test")
        public String showTestForm(Model model) {
        Test test = new Test();
        model.addAttribute("test", test);
        return "newTest";
        }

        @PostMapping("/new_test")
        public String submitTestForm(@ModelAttribute("test") Test test){
        System.out.println(test);
        double result = dataService.calculate(test);
                System.out.println(result);
                test.setResult(result);
        return "testSubmitted";


    }
}

