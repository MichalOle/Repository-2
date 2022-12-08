package com.secend_Package.abstract2;

public class Square extends Shape{
    double result;
    double result2;

    public Square(int a) {
        super(a);
    }

    @Override
    public void pole() {
        result = Math.pow(getA(),2);
        System.out.println("Pole kwadratu wynosi " + result);

    }

    @Override
    public void obwod() {
        result2 = 4* getA();
        System.out.println("Obwód kwadratu wynosi " + result2);
    }
}
