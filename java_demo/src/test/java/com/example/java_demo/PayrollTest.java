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

	// Write unit test code in the 'given, when, then' format. for the validatePhoneNumber method based on the comments.
	@Test
	void testValidatePhoneNumber() {
		// given
		// add employee Object phone number
		String phoneNumber = "1234567890";
		// when
		boolean result = payroll.validatePhoneNumber(phoneNumber);
		// then
		assertTrue(result);
	}

	// Write unit test code in the 'given, when, then' format. for the validatePhoneNumber method based on the comments.

}