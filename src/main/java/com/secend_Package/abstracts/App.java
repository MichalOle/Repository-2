package com.secend_Package.abstracts;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal dog2 = new Dog();
        dog.giveVoice();
        dog2.giveVoice();
        System.out.println(dog2.getNumberOfLegs());

        Krowa krowa = new Krowa(3);
        krowa.giveVoice();
        System.out.println(krowa.getNumberOfLegs());

        AppProcesor appProcesor = new AppProcesor();
        appProcesor.AppProcessor(dog2);
    }
}
