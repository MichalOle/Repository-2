package com.secend_Package.abstract2;

public class App {
    public static void main(String[] args) {
        Shape shape = new Triangol(1,1,1,1);
        shape.pole();
        shape.obwod();
        System.out.println();
        Shape shape2 = new Square(5);
        shape2.pole();
        shape2.obwod();
        System.out.println();
        Shape shape3 = new Rectangle(5,5);
        shape3.pole();
        shape3.obwod();
        System.out.println();
        Shape shape4 = new Circle();
        shape4.pole();
        shape4.obwod();
    }
}
