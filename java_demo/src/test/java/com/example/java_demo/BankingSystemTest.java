package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankingSystemTest {

	private BankingSystem bankingSystem;
	private String accountNumber;

	@BeforeEach
	public void setUp() {
		bankingSystem = new BankingSystem();
		accountNumber = bankingSystem.createAccount("Test Account");
	}

	@Test
	public void testDepositWhenValidAccountNumberAndPositiveAmountThenDepositSuccessful() {
		double initialAmount = 100.0;
		double depositAmount = 50.0;
		double updatedAmount = bankingSystem.deposit(accountNumber, depositAmount);
		assertEquals(initialAmount + depositAmount, updatedAmount,
			"The updated amount should be equal to the initial amount plus the deposit amount");
	}

	@Test
	public void testDepositWhenInvalidAccountNumberThenThrowIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			bankingSystem.deposit("Invalid Account Number", 50.0);
		}, "The deposit method should throw an IllegalArgumentException when an invalid account number is provided");
	}

	@Test
	public void testDepositWhenValidAccountNumberAndNegativeAmountThenThrowIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			bankingSystem.deposit(accountNumber, -50.0);
		}, "The deposit method should throw an IllegalArgumentException when a negative amount is provided");
	}

	@Test
	public void testDepositWhenValidAccountNumberAndZeroAmountThenDepositSuccessful() {
		double initialAmount = 100.0;
		double depositAmount = 0.0;
		double updatedAmount = bankingSystem.deposit(accountNumber, depositAmount);
		assertEquals(initialAmount, updatedAmount,
			"The updated amount should be equal to the initial amount when the deposit amount is zero");
	}
}