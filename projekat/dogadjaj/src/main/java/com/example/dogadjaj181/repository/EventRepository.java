package com.example.dogadjaj181.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dogadjaj181.models.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    
}
