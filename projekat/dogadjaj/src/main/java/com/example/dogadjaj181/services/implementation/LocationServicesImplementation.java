package com.example.dogadjaj181.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.entities.Location;
import com.example.dogadjaj181.models.in.LocationIn;
import com.example.dogadjaj181.models.out.LocationOut;
import com.example.dogadjaj181.repository.LocationRepository;
import com.example.dogadjaj181.services.LocationServices;

@Service
public class LocationServicesImplementation implements LocationServices {

    @Autowired
    private LocationRepository _LocationRepository;

    @Override
    public List<LocationOut> getAllLocations() {
        List<Location> lokacije = _LocationRepository.findAll();
        List<LocationOut> lokacijeOut = new ArrayList<>();

        for(int i=0; i < lokacije.size(); i++){

            lokacijeOut.add(new LocationOut(lokacije.get(i)));
        }
        return lokacijeOut;
    }

    @Override
    public LocationOut addNewLocation(LocationIn locationIn) {
        Location locations = new Location(locationIn);
        _LocationRepository.save(locations);
        return new LocationOut(locations);
    }
    
}
