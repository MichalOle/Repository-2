package com.secend_Package.school;

public class Student {
    private String[] tabOfNames;
    private String name;
    private int size = 0;
    private Grades maths;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.maths = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();

        if (tabOfNames != null) {
            if (tabOfNames.length > 0 ){
                this.size++;
                tabOfNames[this.size] = name;
            }
            else {
                this.size++;
                String[] newTab = new String[this.size];
                newTab[this.size] = name;
                tabOfNames = newTab;
            }
        }
    }

    public void addMathsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.maths.add(grade);
        }
    }
    public void addPhysicsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.physics.add(grade);
        }
    }
    public void addGeographyGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.geography.add(grade);
        }
    }
    public void addHistoryGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.history.add(grade);
        }
    }

    public double getMathsAverage(){
        return this.maths.getAverage();
    }
    public double getPhysicsAverage(){
        return this.physics.getAverage();
    }
    public double getGeographyAverage(){
        return this.geography.getAverage();
    }
    public double getHistoryAverage(){
        return this.history.getAverage();
    }

    public double getAverage(){
        double sum = this.getHistoryAverage() + this.getMathsAverage() + this.getGeographyAverage() + getPhysicsAverage();
        return sum/4;
    }

    public  String[] getAllStudentNames(){
        return tabOfNames;
    }
}

