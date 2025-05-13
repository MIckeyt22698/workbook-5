package com.pluralsight;

public class HoverCraft extends Vehicle {
    public HoverCraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void inflateSkirt() {
        System.out.println("Hovercraft skirt inflated for lift.");
    }

    public void switchToWaterMode() {
        System.out.println("Hovercraft switched to water mode.");
    }
}
