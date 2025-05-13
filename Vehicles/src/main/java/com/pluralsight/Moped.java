package com.pluralsight;

public class Moped extends Vehicle {

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void kickStart() {
        System.out.println("Moped is kick-started and ready to ride.");
    }

    public void parkOnStand() {
        System.out.println("Moped is now parked on its stand.");
    }

}