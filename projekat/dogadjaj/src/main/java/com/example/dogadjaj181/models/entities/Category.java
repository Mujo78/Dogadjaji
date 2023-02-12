package com.example.dogadjaj181.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.example.dogadjaj181.models.in.CategoryIn;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Categoryid;
    
    @Size(max = 255)
    private String nameCategory;

    private String UrlIkona;

    @OneToMany(mappedBy = "kategorija", fetch = FetchType.EAGER)
    private List<Event> eventi;

    public Category() {
    }


    public Category(Integer Categoryid, @Size(max = 255) String nameCategory, String urlIkona) {
        this.Categoryid = Categoryid;
        this.nameCategory = nameCategory;
        this.UrlIkona = urlIkona;
    }

    public Category(CategoryIn cat){
        this.nameCategory = cat.getNameCategory();
        this.UrlIkona = cat.getUrlIkona();
    }

    public Integer getCategoryid() {
        return Categoryid;
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


    public void setCategoryid(Integer categoryid) {
        this.Categoryid = categoryid;
    }


    public List<Event> getEventi() {
        return eventi;
    }


    public void setEventi(List<Event> eventi) {
        this.eventi = eventi;
    }

    

}
