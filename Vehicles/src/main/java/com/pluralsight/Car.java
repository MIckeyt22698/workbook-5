package com.pluralsight;

public class Car extends Vehicle {
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void turnOnAC() {
        System.out.println("Car AC is now turned on.");
    }

    public void openTrunk() {
        System.out.println("The trunk is now open.");
    }
}
