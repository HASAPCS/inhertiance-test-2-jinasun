package com.example;

// TODO: make this class extend Appliance

public class Refrigerator extends Appliance{
    // Additional attributes
    private int temperature;
    private String[]
    private String foodItem;

    public Refrigerator(String brand, String model, int powerUsage, int temperature){
        super(brand, model,powerUsage);
        this.temperature = temperature;
        this.foodItem = foodItem;
    }
    // Constructor
    // TODO: Initialize the Refrigerator with brand, model, power usage, temperature

    public void setTemperature(int newTemperature){
        this.temperature = newTemperature;
    }
    // setTemperature Method
    // TODO: Implement a method to set the temperature of the refrigerator

    
    // Override displayInfo Method from Appliance
    // TODO: Implement a method that extends the information display to include the refrigerator's specific details (temperature)

    



    // Optional Bonus Tasks for additional marks:
    // =========================================

    
    // TODO (Bonus): Add two additional attributes: `foodItems` (a String array) and `itemCount` (an int).
    // `foodItems` will hold the names of food items in the refrigerator, and `itemCount` will track the number of items.
    // Initialize `foodItems` to a length of 5 in the constructor and `itemCount` to 0.

    public addFoodItem(){
        for ()
    }
    // TODO (Bonus): Write the `addFoodItem(String foodItem)` method.
    // This method should add a new food item to the refrigerator if it is possible. Check the test file to ensure you have the correct implementation.
    // If the item was added, the method should return true. Otherwise false.

    // TODO (Bonus): Write the `removeFoodItem(String foodItem)` method.
    // This method should remove a food item from the refrigerator if it exists. Again, check the test file to ensure you have the correct implementation.
    // If the item has been removed it should return true, otherwise false.

    // TODO (Bonus): Write the `getFoodItems()` method.
    // This method should return the current list of food items in the refrigerator.
}

