package com.example.dogadjaj181.models.in;

import org.springframework.lang.Nullable;

public class CategoryIn {
    @Nullable
    private Integer catID;

    private String nameCategory;

    private String UrlIkona;

    public CategoryIn() {
    }

    
    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getUrlIkona() {
        return UrlIkona;
    }

    public void setUrlIkona(String urlIkona) {
        this.UrlIkona = urlIkona;
    }


    public Integer getCatID() {
        return catID;
    }


    public void setCatID(Integer catID) {
        this.catID = catID;
    }

}
