package com.example.dogadjaj181.models.out;

import com.example.dogadjaj181.models.entities.Event;

public class EventOut {
    private Integer EventID;
    
    private String nameEvent;

    private String datum;

    private String opis;

    private String urlPhoto;

    private Integer lokacijaid;

    private Integer kategorijaid;

    private String lokacijaNaziv;

    private String kategorijaNaziv;


    public EventOut(){

    }

    public EventOut(Event events){
        this.nameEvent = events.getNameEvent();
        this.datum = events.getDatum();
        this.opis = events.getOpis();
        this.urlPhoto = events.getUrlPhoto();
        //this.lokacijaid = events.getLokacija().getLocationid();
        //this.kategorijaid = events.getKategorija().getCategoryid();
        this.lokacijaNaziv = events.getLokacija().getNameLocation();
        this.kategorijaNaziv = events.getKategorija().getNameCategory();
    }

    

    public String getLokacijaNaziv() {
        return lokacijaNaziv;
    }

    public void setLokacijaNaziv(String lokacijaNaziv) {
        this.lokacijaNaziv = lokacijaNaziv;
    }

    public String getKategorijaNaziv() {
        return kategorijaNaziv;
    }

    public void setKategorijaNaziv(String kategorijaNaziv) {
        this.kategorijaNaziv = kategorijaNaziv;
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

    public Integer getLokacijaID() {
        return lokacijaid;
    }

    public void setLokacijaID(Integer lokacijaid) {
        this.lokacijaid = lokacijaid;
    }

    public Integer getKategorijaID() {
        return kategorijaid;
    }

    public void setKategorijaID(Integer kategorijaid) {
        this.kategorijaid = kategorijaid;
    }


    

}
