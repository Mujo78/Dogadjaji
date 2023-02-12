package com.example.dogadjaj181.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dogadjaj181.models.in.LocationIn;
import com.example.dogadjaj181.services.LocationServices;

@Controller
public class LocationController {
    
    @Autowired
    private LocationServices _LocationServices;

    @GetMapping("/LocationAddChange")
    public String getAllLocations(Model model){
        model.addAttribute("locations", _LocationServices.getAllLocations());
        return "LocationAddChange";
    }
    
    @PostMapping("/LocationAddChange")
    public String save(@ModelAttribute("loc") LocationIn locationIn){
        _LocationServices.addNewLocation(locationIn);
        return "redirect:/LocationAddChange";
    }
}
