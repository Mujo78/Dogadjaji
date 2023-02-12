package com.example.dogadjaj181.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dogadjaj181.models.in.UserIn;
import com.example.dogadjaj181.services.UserServices;

@Controller
public class UserController {
    
    @Autowired
    private UserServices _UserServices;

    @GetMapping("/users")
    public String listaUsers(Model model){
        model.addAttribute("users", _UserServices.getAll());
        return "users";
    }
    
    @PostMapping("/registration")
    public String save(@ModelAttribute("user") UserIn userIn){
        _UserServices.addUser(userIn);
        return "redirect:/registration";
    }
}
