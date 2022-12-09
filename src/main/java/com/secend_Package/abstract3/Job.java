package com.secend_Package.abstract3;

public abstract class Job {
    private String responsibilities;
    private int salary;

    public Job(String responsibilities, int salary){
        this.responsibilities = responsibilities;
        this.salary = salary;


    }



    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public abstract void select();
}
