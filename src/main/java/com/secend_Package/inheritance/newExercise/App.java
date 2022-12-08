package com.secend_Package.inheritance.newExercise;

public class App {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1998);
        System.out.println("System opercyjny powstał w " + operatingSystem.getYear() + " roku.");
        ChildClass childClass = new ChildClass(1997);
//        System.out.println(operatingSystem.getYear());
//        System.out.println(childClass.getYear());
        OperatingSystem subClass = new SubClass(1996);

        // uruchamianie metod override
//        operatingSystem.turnOff();
        childClass.turnOn();
        subClass.setYear(1995);
//        System.out.println(subClass.getYear());
//        subClass.turnOn();
        subClass.showInfo();


    }
}
