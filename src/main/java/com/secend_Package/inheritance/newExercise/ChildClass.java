package com.secend_Package.inheritance.newExercise;

public class ChildClass extends SubClass {

    public ChildClass(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączono ChildClass");
        //po co te super, bez niego nie widze roznicy
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono ChildClass");
        super.turnOff();
    }
}
