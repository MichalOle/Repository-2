package com.secend_Package.abstracts;

public class Krowa extends Animal{

    public Krowa(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void giveVoice() {
        System.out.println("Muuuu!!!");
    }
}
