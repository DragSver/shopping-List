package com.ulearnProjects.lod.ShoppingList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue
    public Long id;

    public String name;
    public Boolean isBuy;

    public Product(){
    }

    public Product(String name){
        this.id = null;
        this.name = name;
        isBuy = false;
    }

    public Product(Long id, String name, Boolean isBuy){
        this.id = id;
        this.name = name;
        this.isBuy = isBuy;
    }

    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }

    public Boolean getIsBuy() {
        return isBuy;
    }

    public void checked() {
        isBuy = !isBuy;
    }
}

