package com.secend_Package.assertion;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = -8;
        int sum = calculator.Add(a, b);
        int subtract = calculator.Subtract(a, b);
        int pow = calculator.Pow(2,1);
        boolean score = ResultChecker.assertEquals(-3, sum);
//        System.out.println(ResultChecker.assertEquals(-3, sum));
//        System.out.println(calculator.Subtract(a, b));

        if (score) {
            System.out.println("Wynik jest zgodny z oczekiwaniami");
        } else {
            System.out.println("Wynik jest błędny. Metoda sum działa poprawnie");
        }
        score = ResultChecker.assertEquals(13, subtract);

        if (score) {
            System.out.println("Wynik jest zgodny z oczekiwaniami. Metoda sub działą poprawnie.");
        } else {
            System.out.println("Wynik jest błędny. Metoda subtract działa poprawnie");
        }
        score = ResultChecker.assertEquals(2, pow);

        if (score) {
            System.out.println("Wynik jest zgodny z oczekiwaniami. Metoda pow działą poprawnie.");
        } else {
            System.out.println("Wynik jest błędny. Metoda pow nie działa poprawnie");
        }
    }
}
