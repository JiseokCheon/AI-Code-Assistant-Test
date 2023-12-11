package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PayrollTest {

	// create object for the Payroll
	Payroll payroll;

	// create method annotated with @BeaforeEach
	@BeforeEach
	void setUp() throws Exception {
		// create object for the Payroll
		payroll = new Payroll();
	}


	// add unit test for the validatePhoneNumber Method
	@Test
	void testValidatePhoneNumber() {


	}

}