package com.secend_Package.abstracts;

public class AppProcesor {

    public  void AppProcessor(Animal animal){
        System.out.println("Animal has " + animal.getNumberOfLegs());
                animal.giveVoice();
    }
}
