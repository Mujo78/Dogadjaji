package com.example.dogadjaj181.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.example.dogadjaj181.models.in.UserIn;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserID;
    private String ime;
    private String prezime;
    private String email;

    @Size(min = 4)
    private String sifra;


    private Integer roleID;

    public User(){
    }

    public User(UserIn userin){
        this.ime = userin.getIme();
        this.prezime = userin.getPrezime();
        this.email = userin.getEmail();
        this.sifra = userin.getSifra();
        this.roleID = 0;
    }

    
    

    public void setUserID(Integer userID) {
        this.UserID = userID;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }
    

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setID(Integer UserID) {
        this.UserID = UserID;
    }

    
}
