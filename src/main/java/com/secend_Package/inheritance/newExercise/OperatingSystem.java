package com.secend_Package.inheritance.newExercise;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Włączono");
    }

    public void turnOff() {
        System.out.println("Wyłączono");
    }
    public void showInfo(){
        System.out.println("To jest mój system operacyjny.");
    }

}
