package com.cars;

import java.time.LocalDate;

public class Car {
    private String make;
    private String model;
    private String vin;
    private String numberPlate;
    private int year;
    private int mileage;
    private LocalDate registrationDate;
    private String ownerName;
    private String color;
    private String fuelType;

    public Car(){}

    public Car(String make, String model, String vin, String numberPlate, int year, int millage, LocalDate registrationDate, String ownerName, String color, String fuelType) {
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.numberPlate = numberPlate;
        this.year = year;
        this.mileage = millage;
        this.registrationDate = registrationDate;
        this.ownerName = ownerName;
        this.color = color;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /*@Override
    public String toString(){
        return String.format("Car{make='%s', model='%s', vin='%s', numberPlate='%s', year=%d, mileage=%d}",
                make, model, vin, numberPlate, year, mileage);
    }*/
}
