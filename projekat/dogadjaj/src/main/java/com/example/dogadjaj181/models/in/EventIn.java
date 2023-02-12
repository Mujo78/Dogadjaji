package com.example.dogadjaj181.models.in;

import org.springframework.lang.Nullable;


public class EventIn {
    @Nullable
    private Integer EventID;
    

    private String nameEvent;


    private String datum;

    private String opis;

    private String urlPhoto;

    private Integer lokacijaid;

    private Integer kategorijaid;


    


    public EventIn(Integer eventID, String nameEvent, String datum, String opis, String urlPhoto, Integer lokacijaid,
            Integer kategorijaid) {
        this.EventID = eventID;
        this.nameEvent = nameEvent;
        this.datum = datum;
        this.opis = opis;
        this.urlPhoto = urlPhoto;
        this.lokacijaid = lokacijaid;
        this.kategorijaid = kategorijaid;
    }

    public EventIn() {
    }

    public Integer getEventID() {
        return EventID;
    }

    public void setEventID(Integer eventID) {
        this.EventID = eventID;
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

    public Integer getLokacijaid() {
        return lokacijaid;
    }

    public void setLokacijaid(Integer lokacijaid) {
        this.lokacijaid = lokacijaid;
    }

    public Integer getKategorijaid() {
        return kategorijaid;
    }

    public void setKategorijaid(Integer kategorijaid) {
        this.kategorijaid = kategorijaid;
    }



    
}
