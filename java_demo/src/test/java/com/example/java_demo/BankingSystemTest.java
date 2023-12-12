package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankingSystemTest {

	private BankingSystem bankingSystem;

	@BeforeEach
	public void setUp() {
		bankingSystem = new BankingSystem();
	}

	@Test
	public void testCreateAccountWhenNewAccountCreatedThenReturnAccountNumber() {
		// Arrange
		String accountHolderName = "John Doe";

		// Act
		String accountNumber = bankingSystem.createAccount(accountHolderName);

		// Assert
		assertNotNull(accountNumber, "Account number should not be null");
	}

	@Test
	public void testCreateAccountWhenAccountHolderNameNotProvidedThenThrowIllegalArgumentException() {
		// Arrange
		String accountHolderName = null;

		// Act and Assert
		assertThrows(IllegalArgumentException.class, () -> bankingSystem.createAccount(accountHolderName));
	}

	// TODO: Add more test methods here
}