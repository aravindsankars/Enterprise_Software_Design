/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.esd.model;

/**
 *
 * @author aravindsankars
 */
public class Model_Movie {
    private String title;	
    private String actor; 	
    private String actress; 
    private String genre ;  	
    private String year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Model_Movie() {
    }
    
    public Model_Movie(String title, String actor, String actress, String genre, String year) {
        this.title = title;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
        this.year = year;
    }
}
