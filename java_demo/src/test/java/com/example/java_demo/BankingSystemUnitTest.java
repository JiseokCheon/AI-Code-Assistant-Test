package com.example.java_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankingSystemUnitTest {

    @Test
    void testCreateAccountSuccess() {
        // Setup
        BankingSystem bankingSystem = new BankingSystem();
        String accountHolderName = "John Doe";

        // Action
        String accountNumber = bankingSystem.createAccount(accountHolderName);

        // Assertion
        assertTrue(bankingSystem.accountExists(accountNumber));
    }

    @Test
    void testCreateAccountDistinctAccounts() {
        // Setup
        BankingSystem bankingSystem = new BankingSystem();
        String firstAccountHolderName = "John Doe";
        String secondAccountHolderName = "Jane Doe";

        // Action
        String firstAccountNumber = bankingSystem.createAccount(firstAccountHolderName);
        String secondAccountNumber = bankingSystem.createAccount(secondAccountHolderName);

        // Assertion
        assertNotEquals(firstAccountNumber, secondAccountNumber);
    }
}