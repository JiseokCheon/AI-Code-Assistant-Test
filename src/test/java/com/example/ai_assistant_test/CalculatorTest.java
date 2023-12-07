package com.example.ai_assistant_test;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    // add unit test for divide method to handle the exeption scenario
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }

}