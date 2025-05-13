package com.pluralsight;

public class App {
    public static void main(String[] args) {
//        // Moped instance
//        Moped slowRide = new Moped();
//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);
//        slowRide.setNumberOfPassengers(1);
//        slowRide.setCargoCapacity(0);
//
//        // Car
//        Car familyCar = new Car();
//        familyCar.setColor("Blue");
//        familyCar.setFuelCapacity(15);
//        familyCar.setNumberOfPassengers(5);
//        familyCar.setCargoCapacity(500);
//
//        // SemiTruck
//        SemiTruck bigRig = new SemiTruck();
//        bigRig.setColor("Black");
//        bigRig.setFuelCapacity(200);
//        bigRig.setNumberOfPassengers(2);
//        bigRig.setCargoCapacity(20000);
//
//        // Hovercraft
//        HoverCraft glider = new HoverCraft();
//        glider.setColor("Silver");
//        glider.setFuelCapacity(50);
//        glider.setNumberOfPassengers(4);
//        glider.setCargoCapacity(1000);
//
//        // confirm it works
//        System.out.println("Moped color: " + slowRide.getColor() + ", Fuel: " + slowRide.getFuelCapacity());
//        System.out.println("Car color: " + familyCar.getColor() + ", Passengers: " + familyCar.getNumberOfPassengers());
//        System.out.println("SemiTruck cargo capacity: " + bigRig.getCargoCapacity() + ", Fuel: " + bigRig.getFuelCapacity());
//        System.out.println("Hovercraft passengers: " + glider.getNumberOfPassengers() + ", Color: " + glider.getColor());

        Moped slowRide = new Moped("Red", 1, 10, 5);

        System.out.println("Moped color: " + slowRide.getColor());

        slowRide.kickStart();
        slowRide.parkOnStand();
        slowRide.loadCargo(8);
        slowRide.refuel();

        System.out.println();

        // CAR
        Car familyCar = new Car("Blue", 2, 200, 50);

        System.out.println("Car color: " + familyCar.getColor());

        familyCar.turnOnAC();
        familyCar.openTrunk();
        familyCar.loadCargo(150);
        familyCar.refuel();

        System.out.println();

        // SEMI TRUCK
        SemiTruck bigRig = new SemiTruck("Black", 2, 10000, 300);

        System.out.println("SemiTruck color: " + bigRig.getColor());

        bigRig.attachTrailer();
        bigRig.airBrakeCheck();
        bigRig.loadCargo(9500);
        bigRig.refuel();

        System.out.println();

        // HOVERCRAFT
        HoverCraft hover = new HoverCraft("White", 1, 500, 80);

        System.out.println("Hovercraft color: " + hover.getColor());

        hover.inflateSkirt();
        hover.switchToWaterMode();
        hover.loadCargo(400);
        hover.refuel();
    }
    }


