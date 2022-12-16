package com.secend_Package.school;

public class Grades {
    private int[] grade;
    private int size;

    public Grades() {
        this.size = 0;
        this.grade = new int[0];
    }

    public void add(int grades) {
        this.size++;
        int[] newTab = new int[this.size];
        // stara tabela / nowa atbela/ dlugosc starej tabeli
        System.arraycopy(grade, 0, newTab, 0, grade.length);
        newTab[this.size - 1] = grades;
        this.grade = newTab;
    }

    public int[] getValues() {
        return grade;
    }

    public double getAverage() {

        if( this.grade.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.grade.length; i++) {
            sum += this.grade[i];
        }
        return sum / this.grade.length;
    }
}
