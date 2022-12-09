package com.secend_Package.abstract3;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Marc",27,new Soldier("Obrona",2000));
    person.getJob().select();
    }
}
