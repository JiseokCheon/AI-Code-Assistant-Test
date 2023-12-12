package com.example.java_demo;

public class Account {
	private static double balance;

	public Account() {
		this.balance = 0.0;
	}

	public double deposit(double amount) {

		// service call deposit

		// db call to deposit
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid deposit amount");
		}
		balance += amount;

		return balance;
	}

	public double withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid withdrawal amount");
		}
		if (balance < amount) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		balance -= amount;
		return balance;
	}

	public double getBalance() {
		return balance;
	}
}