package com.example.dogadjaj181.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dogadjaj181.models.entities.Event;
import com.example.dogadjaj181.models.out.EventOut;
import com.example.dogadjaj181.services.EvenServices;





@Controller
public class HomeCotroller {

    @Autowired
    private EvenServices _EvenServices;

    @GetMapping("/allEvents")
    public String showAllEvents(Model model){
        model.addAttribute("allEvents", _EvenServices.getAllEvents());
        return "allEvents";
    }

    @GetMapping("/")
    public String showHomeEvents(Model model) throws ParseException{
        //List<EventOut> eventsActive = _EvenServices.getAllEvents();
        //List<EventOut> pomocnaLista = new ArrayList<>();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //for(int  i = 0; i < eventsActive.size(); i++){
        //    Date d = new Date();
        //    sdf.format(d);
        //    String stringDate = sdf.format(eventsActive.get(i).getDatum());
        //    if(d.compareTo(sdf.parse(eventsActive.get(i).getDatum())) == 0){
        //        pomocnaLista.add(eventsActive.get(i));
        //    }
        //}
        model.addAttribute("events", _EvenServices.getAllEvents());

        return "home";
    }


    @GetMapping("/search")
    public String showSearch(){
        return "search";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/LocationAdd")
    public String addLocation(){
        return "LocationAdd";
    }
    
    @GetMapping("/AdminMenu")
    public String adminMenu(){
        return "AdminMenu";
    }

}
