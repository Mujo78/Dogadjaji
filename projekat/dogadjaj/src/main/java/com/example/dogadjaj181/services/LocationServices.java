package com.example.dogadjaj181.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.in.LocationIn;
import com.example.dogadjaj181.models.out.LocationOut;

@Service
public interface LocationServices {
    List<LocationOut> getAllLocations();

    LocationOut addNewLocation(LocationIn locationIn);
}
