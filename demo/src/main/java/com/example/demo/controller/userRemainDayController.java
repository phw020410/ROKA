package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.dto.ROKA;
import com.example.demo.model.service.ROKAService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping(path = "userRemainDay")
public class userRemainDayController {
    @Autowired
    private ROKAService rokaService;

    @GetMapping(path = "{user_seq}")
    public String userRemainDay(@PathVariable(value = "user_seq") int seq, Model model) {
        model.addAttribute("army", rokaService.getUser(seq));
        return "userRemainDay";
    }

    @GetMapping(path = "addUser")
    public String addUser() {
        return "addUser";
    }

    @PostMapping(value="addUserBE")
    public String postMethodName(ROKA roka, Model model) {
        Integer hashSeq = roka.hashCode();
        roka.setSeq(hashSeq);
        rokaService.addUser(roka, hashSeq);
        return "redirect:/home";
    }
}
