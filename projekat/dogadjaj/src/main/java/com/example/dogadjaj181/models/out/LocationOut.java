package com.example.dogadjaj181.models.out;

import com.example.dogadjaj181.models.entities.Location;

public class LocationOut {
    private Integer Locationid;

    private String nameLocation;

    private String description;

    private String UrlIkona;

    public LocationOut(){

    }

    public LocationOut(Location location){
        this.Locationid = location.getLocationid();
        this.nameLocation = location.getNameLocation();
        this.description = location.getDescription();
        this.UrlIkona = location.getUrlIkona();
    }

    public Integer getLocationid() {
        return Locationid;
    }

    public void setLocationid(Integer locationid) {
        this.Locationid = locationid;
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
