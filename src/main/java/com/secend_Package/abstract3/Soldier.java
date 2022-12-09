package com.secend_Package.abstract3;

public class Soldier extends Job{

    public Soldier(String responsibilities, int salary) {
        super(responsibilities, salary);
    }

//    public Soldier(String responsibilities, int salary) {
//    super(responsibilities,salary);
//    }

    @Override
    public void select() {
        System.out.println("Ochrona granic");
        System.out.println("Zarabia 2000 zł");
    }
}
