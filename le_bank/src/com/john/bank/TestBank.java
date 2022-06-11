package com.john.bank;

public class TestBank {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();
		account1.depositChecking(10.00);
		account1.depositChecking(10.00);
		account1.withdawChecking(12.23);
		account1.withdawChecking(99.23);
		System.out.println(account1.getCheckingBalance());
	}

}
