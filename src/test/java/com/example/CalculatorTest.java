package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(0, calculator.subtract(2, 2));
        assertEquals(-4, calculator.subtract(2, 6));
    }

    @Test
    void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(-4, calculator.multiply(2, -2));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2));
        assertEquals(0.5, calculator.divide(1, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}