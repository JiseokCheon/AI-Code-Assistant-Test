package com.example.java_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankingSystem {

	private static Map<String, Account> accounts = new HashMap<>();

	public String createAccount(String accountHolderName) {
		String accountNumber = generateAccountNumber();
		Account account = new Account();
		accounts.put(accountNumber, account);
		return accountNumber;
	}

	public double deposit(String accountNumber, double amount) {
		if (!accountExists(accountNumber)) {
			throw new IllegalArgumentException("Invalid account number");
		}

		Account account = accounts.get(accountNumber);
		double updatedAmount = account.deposit(amount);
		return updatedAmount;
	}

	public double withdraw(String accountNumber, double amount) {
		if (!accountExists(accountNumber)) {
			throw new IllegalArgumentException("Invalid account number");
		}

		Account account = accounts.get(accountNumber);
		double updatedAmount = account.withdraw(amount);
		return updatedAmount;
	}

	public boolean accountExists(String accountNumber) {
		return accounts.containsKey(accountNumber);
	}

	public double getBalance(String accountNumber) {
		if (!accountExists(accountNumber)) {
			throw new IllegalArgumentException("Invalid account number");
		}

		Account account = accounts.get(accountNumber);
		return account.getBalance();
	}

	private String generateAccountNumber() {
		return UUID.randomUUID().toString();
	}

}
