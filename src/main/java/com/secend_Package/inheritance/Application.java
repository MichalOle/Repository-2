package com.secend_Package.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(2,2);
        car.turnOnLights();
        Car.turnOnLights();
        car.openDoors();

        Convertible convertible = new Convertible(4,4);
        convertible.openRoof();
        convertible.openDoors();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
        car.displayNumberOfSeats();


    }
}
