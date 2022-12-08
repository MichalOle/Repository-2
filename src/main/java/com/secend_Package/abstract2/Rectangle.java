package com.secend_Package.abstract2;

public class Rectangle extends Shape{
    double result;
    double result2;
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public void pole() {
        result = getA()*getB();
        System.out.println("Pole prostokąta wynosi " + result);
    }

    @Override
    public void obwod() {
        result2 = 2*(getA()+getB());
        System.out.println("Obwód prostokąta wynosi " + result2);
    }
}
