package com.john.bank;

public class BankAccount {
	
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;
	private static int numOfAccounts = 0;
	private static double total = 0.0;
	
	public BankAccount() {
		total++;
	}
	
//	methods:
	public void depositChecking(double amount ) {
		checkingBalance += amount;
		total += amount;
	}
	
	public void withdawChecking(double amount) {
		if (amount > this.getCheckingBalance()) {
			System.out.println("not enough");
		} else {
//			change the checkingBalnce with getters and setters
			this.setCheckingBalance(this.getCheckingBalance() - amount);
			total -= amount;
			System.out.println("your total is now CheckingBalance: " + this.getCheckingBalance());
		}
	}
	
	
	

//	--- GETTERS AND SETTERS ---
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	public static void setNumOfAccounts(int numOfAccounts) {
		BankAccount.numOfAccounts = numOfAccounts;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		BankAccount.total = total;
	}
	
}
