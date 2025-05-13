package com.pluralsight;

public class SemiTruck extends Vehicle {
    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void attachTrailer() {
        System.out.println("Trailer attached to the semi-truck.");
    }

    public void airBrakeCheck() {
        System.out.println("Air brakes are working correctly.");
    }

}
