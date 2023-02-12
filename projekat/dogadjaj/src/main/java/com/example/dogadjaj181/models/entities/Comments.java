package com.example.dogadjaj181.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CommentID;
    @Size(max = 10)
    private String datum;
    @Size(max = 100)
    private String text;


    
    
    
    public Comments() {
    }
    public Comments(Integer commentID, @Size(max = 10) String datum, @Size(max = 100) String text) {
        CommentID = commentID;
        this.datum = datum;
        this.text = text;
    }
    public String getDatum() {
        return datum;
    }
    public void setDatum(String datum) {
        this.datum = datum;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Integer getCommentID() {
        return CommentID;
    }
    public void setCommentID(Integer commentID) {
        CommentID = commentID;
    }

}
