package com.secend_Package.abstract2;

public class Triangol extends Shape {
    public double result;
    public double result2;


    public Triangol(int a, int b, int c, int h) {
        super(a, b, c, h);
    }

    @Override
    public void pole() {
        result = 0.5* getA()*getH();
        System.out.println("Pole trójkąta wynosi " + result);

    }

    @Override
    public void obwod() {
        result2 = getA()+getB()+getC();
        System.out.println("Obwód trójkąta wynosi " + result2);
    }

}
