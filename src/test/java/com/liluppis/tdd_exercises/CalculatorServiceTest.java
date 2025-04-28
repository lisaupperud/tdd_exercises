package com.liluppis.tdd_exercises;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    @Test
    void testAddition() {
        CalculatorService cs = new CalculatorService();

        int a = 5;
        int b = 2;

        cs.a = a;
        cs.b = b;

        assertEquals(7, cs.addTwoNumbers(a, b));
    }

    @Test
    void testSubtraction() {

        CalculatorService cs = new CalculatorService();

        int a = 7;
        int b = 2;

        cs.a = a;
        cs.b = b;

        assertEquals(5, cs.subtractTwoNumbers(a, b));

    }

    @Test
    void testMultiplication() {

        CalculatorService cs = new CalculatorService();

        int a = 2;
        int b = 5;

        cs.a = a;
        cs.b = b;

        assertEquals(10, cs.multiplyTwoNumbers(a, b));

    }

    @Test
    void testDivision() {

        CalculatorService cs = new CalculatorService();

        double a = 10;
        double b = 0;

        cs.c = a;
        cs.d = b;

        assertEquals(0, cs.divideTwoNumbers(a, b));
    }

}
