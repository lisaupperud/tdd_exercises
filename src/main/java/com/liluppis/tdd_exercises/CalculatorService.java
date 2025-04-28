package com.liluppis.tdd_exercises;

public class CalculatorService {

    public int a;
    public int b;

    public double c;
    public double d;

    public int addTwoNumbers( int a, int b ) {
        return a + b;
    }

    public int subtractTwoNumbers( int a, int b ) {
        return a - b;
    }

    public int multiplyTwoNumbers( int a, int b ) {
        return a * b;
    }

    public double divideTwoNumbers( double c, double d ) {
        try {
            return c / d;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0.0;
        }
    }

}
