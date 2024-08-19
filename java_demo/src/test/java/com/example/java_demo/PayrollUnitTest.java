package com.example.java_demo;

import com.example.java_demo.Payroll;
import com.example.java_demo.Employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// This class is created to unit test the methods within the Payroll class.
public class PayrollUnitTest {

	// Testing the validatePhoneNumber() method in the Payroll class
	@Test
	void testValidatePhoneNumber_valid() {
		// Creating an instance of Payroll
		Payroll payroll = new Payroll();
		// Creating an instance of Employee with a valid phone number
		Employee employee = new Employee("John", 50000, 30, "Engineer", "john@email.com", "1234567890");
		// Expecting validatePhoneNumber() to return true for a valid phone number
		assertTrue(payroll.validatePhoneNumber(employee));
	}

	// Testing the validatePhoneNumber() method in the Payroll class
	@Test
	void testValidatePhoneNumber_invalid() {
		// Creating an instance of Payroll
		Payroll payroll = new Payroll();
		// Creating an instance of Employee with an invalid phone number
		Employee employee = new Employee("John", 50000, 30, "Engineer", "john@email.com", "12345");
		// Expecting validatePhoneNumber() to return false for an invalid phone number
		assertFalse(payroll.validatePhoneNumber(employee));
	}

	@Test
	public void testValidateEmailAddress_ValidFormat() {
		// Arrange
		Employee employee = new Employee("John Doe", 50000, 35, "Engineer", "johndoe@example.com", "1234567890");
		Payroll payroll = new Payroll();

		// Act
		boolean isValid = payroll.validateEmailAddress(employee);

		// Assert
		assertTrue(isValid);
	}

	@Test
	public void testValidateEmailAddress_InValidFormat() {
		// Arrange
		Employee employee = new Employee("Jane Doe", 60000, 30, "Manager", "janedoe.exam.com", "0987654321");
		Payroll payroll = new Payroll();

		// Act
		boolean isValid = payroll.validateEmailAddress(employee);

		// Assert
		assertFalse(isValid);
	}

	@Test
	public void testValidateEmailAddress_EmptyString() {
		// Arrange
		Employee employee = new Employee("NoEmail Doe", 40000, 55, "Analyst", "", "1234509876");
		Payroll payroll = new Payroll();

		// Act
		boolean isValid = payroll.validateEmailAddress(employee);

		// Assert
		assertFalse(isValid);
	}

	@Test
	void testCalculateNetSalaryForManager() {
		// Set up
		Employee employee = new Employee("John Doe", 10000.0, 30, "Manager", "jdoe@example.com", "1234567890");
		Payroll payroll = new Payroll();

		// Execute
		double netSalary = payroll.calculateNetSalary(employee);

		// Assert
		double expectedNetSalary = 11000.0; // basic salary + 10% of basic salary
		assertEquals(expectedNetSalary, netSalary);
	}

	@Test
	void testCalculateNetSalaryForEngineer() {
		// Set up
		Employee employee = new Employee("Jane Doe", 10000.0, 28, "Engineer", "jadoe@example.com", "0987654321");
		Payroll payroll = new Payroll();

		// Execute
		double netSalary = payroll.calculateNetSalary(employee);

		// Assert
		double expectedNetSalary = 10500.0; // basic salary + 5% of basic salary
		assertEquals(expectedNetSalary, netSalary);
	}

	@Test
	void testCalculateNetSalaryForAnalyst() {
		// Set up
		Employee employee = new Employee("Jane Analyst", 10000.0, 28, "Analyst", "jaanalyst@example.com", "1122334455");
		Payroll payroll = new Payroll();

		// Execute
		double netSalary = payroll.calculateNetSalary(employee);

		// Assert
		double expectedNetSalary = 10300.0; // basic salary + 3% of basic salary
		assertEquals(expectedNetSalary, netSalary);
	}

	@Test
	void testCalculateNetSalaryForOtherDesignations() {
		// Set up
		Employee employee = new Employee("Other Doe", 10000.0, 28, "Other", "otherdoe@example.com", "5544332211");
		Payroll payroll = new Payroll();

		// Execute
		double netSalary = payroll.calculateNetSalary(employee);

		// Assert
		double expectedNetSalary = 10000.0; // basic salary without any increment
		assertEquals(expectedNetSalary, netSalary);
	}

}// end class