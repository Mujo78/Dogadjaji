package com.example.dogadjaj181.models.out;

import com.example.dogadjaj181.models.entities.Category;

public class CategoryOut {
    private Integer Categoryid;
    
    private String nameCategory;

    private String UrlIkona;

    public CategoryOut(){

    }

    public CategoryOut(Category cat){
        this.Categoryid = cat.getCategoryid();
        this.nameCategory = cat.getNameCategory();
        this.UrlIkona = cat.getUrlIkona();
    }

    public Integer getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.Categoryid = categoryid;
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
        UrlIkona = urlIkona;
    }

    
}
