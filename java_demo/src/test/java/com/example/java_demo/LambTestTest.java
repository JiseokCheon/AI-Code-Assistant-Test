package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// create
public class LambTestTest {

	// add unit test for the getElement Method
	@Test
	void testGetElement() {
		// add mock data
		String[] str = {"Hello", "World"};
		// check the condition
		assertEquals(LambTest.getElement(str, 1), "World");

	}
}