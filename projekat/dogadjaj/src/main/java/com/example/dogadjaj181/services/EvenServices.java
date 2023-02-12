package com.example.dogadjaj181.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.in.EventIn;
import com.example.dogadjaj181.models.out.EventOut;

@Service
public interface EvenServices {
    List<EventOut> getAllEvents();

    EventOut addNewEvent(EventIn eventIn);
}
