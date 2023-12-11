package com.example.java_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    // add unit test for divide method to handle the exeption scenario
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }

}