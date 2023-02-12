package com.example.dogadjaj181.models.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.example.dogadjaj181.models.in.EventIn;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer EventID;
    
    @Size(max = 255)
    private String nameEvent;

    @Size(max = 10)
    private String datum;

    @Size(max = 1024)
    private String opis;

    @Size(max = 500)
    private String urlPhoto;

    @ManyToOne
    private Location lokacija;

    @ManyToOne
    private Category kategorija;


    


    public Event(EventIn eIn) {
        this.nameEvent = eIn.getNameEvent();
        this.datum = eIn.getDatum();
        this.opis = eIn.getOpis();
        this.urlPhoto = eIn.getUrlPhoto();
    }

    public Event() {
    }

    public Integer getEventID() {
        return EventID;
    }

    public void setID(Integer EventID) {
        this.EventID = EventID;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Location getLokacija() {
        return lokacija;
    }

    public void setLokacija(Location lokacija2) {
        this.lokacija = lokacija2;
    }

    public Category getKategorija() {
        return kategorija;
    }

    public void setKategorija(Category kategorija) {
        this.kategorija = kategorija;
    }

    

}
