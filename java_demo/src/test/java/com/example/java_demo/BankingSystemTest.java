package com.example.java_demo;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class BankingSystemTest {


    @InjectMocks
    private BankingSystem bankingSystem;

    @BeforeEach
    void setUp(){
        String account = "TestAccount";
        bankingSystem.createAccount(account);
    }

    @Test
    void deposit_성공(){
        String account = "TestAccount";
        double amount = 100;
        double updatedAmount = bankingSystem.deposit(account, amount);
        Assertions.assertEquals(100, updatedAmount);
    }

    @Test
    void deposit_IllegalArgumentException(){
        String account = "TestAccountException";
        double amount = 100;
        Assertions.assertThrows(IllegalArgumentException.class, () -> bankingSystem.deposit(account, amount));
    }

    @Test
    void deposit_(){
        String account = "TestAccountException";
        double amount = 100;
        Assertions.assertThrows(IllegalArgumentException.class, () -> bankingSystem.deposit(account, amount));
    }
}