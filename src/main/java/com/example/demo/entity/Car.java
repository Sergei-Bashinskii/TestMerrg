package com.example.demo.entity;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Car {

    private String marka;

    public Car(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
