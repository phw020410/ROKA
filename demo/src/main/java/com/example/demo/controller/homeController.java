package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.service.ROKAService;

@Controller
public class homeController {
    @Autowired
    private ROKAService rokaService;

    @GetMapping(path = "home")
    public String home(Model model) {
        model.addAttribute("all_user", rokaService.getAllData());
        return "home";
    }
}
