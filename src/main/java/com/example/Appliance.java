package com.example;

public class Appliance {
    // Attributes
    private String brand;
    private String model;
    private int powerUsage;
    // TODO: Declare common attributes for electronic devices, such as brand and model and powerUsage.

    // Constructor
    public Appliance(String brand, String model, int powerUsage) {
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
        // TODO: Initialize all attributes
    }

    // Getters
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public int getPowerUsage(){
        return this.powerUsage;
    }

    public void setBrand (String newBrand){
        this.brand = newBrand;
    }

    public void setModel (String newModel){
        this.model = newModel;
    }

    public void setPowerUsage(int newPowerUsage){
        this.powerUsage = newPowerUsage;
    }
    // TODO: Implement getters for brand, model, and powerUsage

    public void displayInfo (){
    }
    // displayInfo Method
    // TODO: Implement a method that returns information about the appliance, including brand, model, and power usage.
    // Check the tests for more details

    public void isEcoFriendly(){
        if (this.powerUsage <= 400){
            println("The displayInfo method does not return the correct information.");
        }
    }
    // isEcoFriendly Method
    // TODO: Implement a method to check if the appliance is eco-friendly based on its power usage. 
    // An appliance that uses less than 400 Watts of power is eco-friendly.

}

