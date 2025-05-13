package com.pluralsight;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    // Getters and setters...
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public int getCargoCapacity() { return cargoCapacity; }
    public void setCargoCapacity(int cargoCapacity) { this.cargoCapacity = cargoCapacity; }

    public int getFuelCapacity() { return fuelCapacity; }
    public void setFuelCapacity(int fuelCapacity) { this.fuelCapacity = fuelCapacity; }


    public void loadCargo(int amount) {
        if (amount <= cargoCapacity) {
            System.out.println("Loaded " + amount + " units of cargo.");
        } else {
            System.out.println("Cannot load cargo. Exceeds capacity of " + cargoCapacity);
        }
    }

    // Optional: another method
    public void refuel() {
        System.out.println("Refueling to " + fuelCapacity + " liters.");
    }


    public void drive() {
        System.out.println("The vehicle is driving.");
    }
}
