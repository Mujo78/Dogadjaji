package com.example.dogadjaj181.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.example.dogadjaj181.models.in.LocationIn;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Locationid;
    
    @Size(max = 255)
    public String nameLocation;

    @Size(max = 1000)
    public String description;

    public String UrlIkona;

    @OneToMany(mappedBy = "lokacija", fetch = FetchType.EAGER)
    private List<Event> events;


    public Location() {
    }

    public Location(LocationIn lIn){
        this.nameLocation = lIn.getNameLocation();
        this.description = lIn.getDescription();
        this.UrlIkona = lIn.getUrlIkona();
    }


    public Integer getLocationid() {
        return Locationid;
    }

    public void setId(Integer Locationid) {
        this.Locationid = Locationid;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlIkona() {
        return UrlIkona;
    }

    public void setUrlIkona(String urlIkona) {
        this.UrlIkona = urlIkona;
    }


    

}
