package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {
    @Test
    public void testMopedBehavior() {
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setFuelCapacity(5);
        moped.setNumberOfPassengers(1);

        assertEquals("Red", moped.getColor());
        assertEquals(5, moped.getFuelCapacity());
        assertEquals(1, moped.getNumberOfPassengers());
    }

    @Test
    public void testCarSettersAndGetters() {
        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(5);

        assertEquals("Blue", familyCar.getColor());
        assertEquals(5, familyCar.getNumberOfPassengers());
    }

    @Test
    public void testSemiTruckCargo() {
        SemiTruck hauler = new SemiTruck();
        hauler.setCargoCapacity(2000);

        assertEquals(2000, hauler.getCargoCapacity());
    }

    @Test
    public void testHoverCraftProperties() {
        HoverCraft hover = new HoverCraft();
        hover.setColor("White");
        hover.setFuelCapacity(50);

        assertEquals("White", hover.getColor());
        assertEquals(50, hover.getFuelCapacity());
    }

}