package com.example.dogadjaj181.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.entities.Category;
import com.example.dogadjaj181.models.entities.Event;
import com.example.dogadjaj181.models.entities.Location;
import com.example.dogadjaj181.models.in.EventIn;
import com.example.dogadjaj181.models.out.EventOut;
import com.example.dogadjaj181.repository.CategoryRepository;
import com.example.dogadjaj181.repository.EventRepository;
import com.example.dogadjaj181.repository.LocationRepository;
import com.example.dogadjaj181.services.EvenServices;

@Service
public class EventServicesImplementation implements EvenServices {
 
    @Autowired
    private EventRepository _EventRepository;

    @Autowired
    private LocationRepository _LocationRepository;

    @Autowired
    private CategoryRepository _CategoryRepository;

    @Override
    public List<EventOut> getAllEvents() {
        List<Event> eventi = _EventRepository.findAll();
        List<EventOut> eventsOut = new ArrayList<>();

        for(Event events : eventi){
            eventsOut.add(new EventOut(events));
        }
        return eventsOut;
    }

    @Override
    public EventOut addNewEvent(EventIn eventIn) {
        Event events = new Event(eventIn);
        Location lokacija = new Location();
        System.out.println(eventIn.getLokacijaid());
        lokacija = _LocationRepository.findById(eventIn.getLokacijaid()).get();
        events.setLokacija(lokacija);
        Category kategorija = new Category();
        kategorija = _CategoryRepository.findById(eventIn.getKategorijaid()).get();
        events.setKategorija(kategorija);
        _EventRepository.save(events);
        return new EventOut(events);
    }
}
