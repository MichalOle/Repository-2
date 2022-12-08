package com.secend_Package.inheritance.newExercise;

public class SubClass extends OperatingSystem {

    public SubClass(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączono SubClass");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono SubClass");
    }

}
