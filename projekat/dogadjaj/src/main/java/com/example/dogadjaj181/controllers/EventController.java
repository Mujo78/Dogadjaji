package com.example.dogadjaj181.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dogadjaj181.models.in.EventIn;
import com.example.dogadjaj181.services.CategoryService;
import com.example.dogadjaj181.services.EvenServices;
import com.example.dogadjaj181.services.LocationServices;

@Controller
public class EventController {
 
    
    @Autowired
    private EvenServices _EvenServices;

    @Autowired
    private LocationServices _LocationServices;

    @Autowired
    private CategoryService _CategoryService;

    @GetMapping("/AddEvent")
    public String listEvent(Model model){
        model.addAttribute("locations", _LocationServices.getAllLocations());
        model.addAttribute("category", _CategoryService.getAllCategories());
        EventIn eventIn = new EventIn();
        model.addAttribute("eventIn", eventIn);
        return "AddEvent";
    }

    @PostMapping("/AddEvent")
    public String save(@ModelAttribute("eventIn") EventIn eventIn){
        _EvenServices.addNewEvent(eventIn);
        return "redirect:/AddEvent";
    }


    @GetMapping("/EventAddChange")
    public String goEvent(){
        return "EventAddChange";
    }

}
