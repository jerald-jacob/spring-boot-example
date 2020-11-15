/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.springCRUD;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jerald
 */
@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madien;
    private float price;

    protected Product(){
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getMadien() {
        return madien;
    }

    public float getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMadien(String madien) {
        this.madien = madien;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
