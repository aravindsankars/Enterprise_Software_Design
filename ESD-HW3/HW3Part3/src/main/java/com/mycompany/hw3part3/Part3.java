/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw3part3;

/**
 *
 * @author aravindsankars
 */
public class Part3 {
    private String emailID;

    public String getemailID() {
        return emailID;
    }

    public void setemailID(String emailID) {
        this.emailID = emailID;
    }
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Part3(String emailID, String Name) {
        this.emailID = emailID;
        this.Name = Name;
    }
}
