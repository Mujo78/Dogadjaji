package com.example.dogadjaj181.models.in;

import org.springframework.lang.Nullable;

public class LocationIn {
    @Nullable
    private Integer LocationID;

    private String nameLocation;

    private String description;

    private String UrlIkona;

    

    public LocationIn() {
    }


    

    public Integer getLocationID() {
        return LocationID;
    }

    public void setLocationID(Integer locationID) {
        this.LocationID = locationID;
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
