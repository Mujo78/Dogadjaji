package com.example.dogadjaj181.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dogadjaj181.models.in.CategoryIn;
import com.example.dogadjaj181.services.CategoryService;

@Controller
public class CategoryController {
    
    @Autowired
    private CategoryService _CategoryService;

    @GetMapping("/CategoryAddChange")
    public String listCategory(Model model){
        model.addAttribute("categories", _CategoryService.getAllCategories());
        return "CategoryAddChange";
    }
    
    @PostMapping("/CategoryAddChange")
    public String save(@ModelAttribute("cat") CategoryIn categoryIn){
        _CategoryService.addNewCategory(categoryIn);
        return "redirect:/CategoryAddChange";
    }

    //@PutMapping("/CategoryAddChange")
    //public 
}
