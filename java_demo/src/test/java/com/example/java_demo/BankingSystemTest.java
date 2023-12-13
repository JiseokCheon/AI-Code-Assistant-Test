package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankingSystemTest {

	// create object for the BankingSystem class
	BankingSystem bankingSystem;

	@BeforeEach
	void setUp() throws Exception {
		bankingSystem = new BankingSystem();
	}

	// add valid unit test for the deposit method in the BankingSystem class
	@Test
	void testDepositValid() {
		// create object for the BankingSystem class
		BankingSystem bankingSystem = new BankingSystem();
		// check the condition
		assertEquals(bankingSystem.deposit(100), 100);
	}


	// add invalid unit test for the deposit method in the BankingSystem class

	@Test
	void testDepositInvalid() {
		// create object for the BankingSystem class
		BankingSystem bankingSystem = new BankingSystem();
		// check the condition
		assertEquals(bankingSystem.deposit(-100), 0);
	}

}