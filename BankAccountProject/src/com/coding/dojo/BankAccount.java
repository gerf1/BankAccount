package com.coding.dojo;

import java.util.Random;

public class BankAccount {

	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts;
	public static double totalAmount;

	public BankAccount() {
		accountNumber = generateAccountNumber();
		checkingBalance = checkingBalance;
		numberOfAccounts += 1;
		savingsBalance = savingsBalance;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static double getTotalAmount() {
		return totalAmount;
	}

	private String generateAccountNumber() {

		String newNumber = "";

		Random randomNumber = new Random();

		for (int i = 0; i < 10; i++) {
			int rand = randomNumber.nextInt(10);
			newNumber += rand;
		}

		return newNumber;
	}

	public void accountDeposit(String type, Double depositAmount) {
		if (type == "Checking") {
			setCheckingBalance(getCheckingBalance() + depositAmount);
			totalAmount += depositAmount;
		}
		if (type == "savings" || type == "Savings") {
			setSavingsBalance(getSavingsBalance() + depositAmount);
			totalAmount += depositAmount;
		} else {
			System.out.println("Please choose apporpiate account type. ");
		}
	}

	public void accountWithdrawal(String type, Double withdrawalAmount) {
		if (type == "Checking") {
			if (getCheckingBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds! in Checking Account");
			} else {
				setCheckingBalance(getCheckingBalance() - withdrawalAmount);
				totalAmount -= withdrawalAmount;
			}
		}
		if (type == "Savings") {
			if (getSavingsBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds! in Savings Account");
			} else {
				setSavingsBalance(getSavingsBalance() - withdrawalAmount);
				totalAmount -= withdrawalAmount;
			}
		}
	}

	public Double myBalance() {
		Double totalBalance = checkingBalance + savingsBalance;
		System.out.println(totalBalance);
		return totalBalance;
	}

}
