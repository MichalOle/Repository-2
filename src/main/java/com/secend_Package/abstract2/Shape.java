package com.secend_Package.abstract2;

import java.util.Scanner;

public abstract class Shape {
    private int a;
    private int b;
    private int c;
    private int h;
    private double r;


    public Shape (){
    }
    public Shape (int a){
    this.a = a;
    }

    public Shape(int a, int b){
    this.a = a;
    this.b = b;
    }
    public Shape(int a, int b, int c, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public double getR() {
        return r;
    }
    public void setR(){
        System.out.println("Brak danych!" + "\n" + "Podaj promień koła z dokładnością do dwóch miejs po przecinku");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getA(){
        return a;
        }
    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public abstract void pole();
    public abstract void obwod();
}
