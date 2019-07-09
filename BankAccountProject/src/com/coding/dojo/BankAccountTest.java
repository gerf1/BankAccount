package com.coding.dojo;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount userA = new BankAccount();
		BankAccount userB = new BankAccount();

		
		userA.accountDeposit("Checking", 3000.00);
		userA.accountDeposit("Savings", 1500.00);
		userA.accountWithdrawal("Checking", 150.00);
		userA.accountWithdrawal("Savings", 500.00);
		userA.myBalance();


		userB.accountDeposit("Checking", 3070.00);
		userB.accountDeposit("Savings", 1560.00);
		userB.accountWithdrawal("Checking", 1530.00);
		userB.accountWithdrawal("Savings", 5850.00);
		userB.myBalance();
		
		
		
	}

}
