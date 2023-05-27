/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.esd.model;

import java.util.Objects;

/**
 *
 * @author aravindsankars
 */
public class Model_Shop {
     private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Items{" + "item=" + item + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.item);
        return hash;
    }
    
       @Override
    public boolean equals(Object anObject) {
        if (!(anObject instanceof Model_Shop)) {
            return false;
        }
        Model_Shop otherMember = (Model_Shop)anObject;
        return otherMember.getItem().equals(getItem());
    }
}
