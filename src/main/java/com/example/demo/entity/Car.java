package com.example.demo.entity;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Car {

    private String color;
    private int kolosa;

    public Car(String color, int kolosa) {
        this.color = color;
        this.kolosa = kolosa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKolosa() {
        return kolosa;
    }

    public void setKolosa(int kolosa) {
        this.kolosa = kolosa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return kolosa == car.kolosa && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, kolosa);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", kolosa=" + kolosa +
                '}';
    }
}
