package com.secend_Package.abstract2;

public class Circle extends Shape{
    double PI = Math.PI;
    double result;
    double result2;

    public Circle(){
        setR();
    }
    @Override
    public void pole() {
        result = PI*(Math.pow(getR(),2));
        System.out.println("Pole powierzchni koła wynosi " + Math.floor(result));
    }

    @Override
    public void obwod() {
        result2 = 2*PI*getR();
        System.out.println("Obwód  koła wynosi " + Math.floor(result2));
    }
}
