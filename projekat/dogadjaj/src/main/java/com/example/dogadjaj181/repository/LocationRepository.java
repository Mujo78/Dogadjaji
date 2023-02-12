package com.example.dogadjaj181.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dogadjaj181.models.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    
}
