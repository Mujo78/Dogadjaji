package com.example.dogadjaj181.models.out;

import com.example.dogadjaj181.models.entities.User;

public class UserOut {
    private Integer UserID;
    private String ime;
    private String prezime;
    private String email;
    private String sifra;
    private Integer roleID;


    public UserOut(){

    }

    public UserOut(User user){
        this.ime = user.getIme();
        this.prezime = user.getPrezime();
        this.email = user.getEmail();
        this.sifra = user.getSifra();
        this.roleID = user.getRoleID();
    }


    public Integer getUserID() {
        return UserID;
    }
    public void setUserID(Integer userID) {
        this.UserID = userID;
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

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }
}
