package com.example.java_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    // add unit test for divide method to handle the exception scenario
    @Test
    public void testDivide() {
        // create object for the Calculator
        Calculator calculator = new Calculator();
        // check the condition
        assertEquals(calculator.divide(10, 2), 5);
    }

}