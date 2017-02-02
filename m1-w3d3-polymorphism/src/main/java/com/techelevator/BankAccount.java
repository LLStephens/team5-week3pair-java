package com.techelevator;

public class BankAccount {
	protected BankCustomer customer;
	private String accountNumber;
	protected DollarAmount balance;


	public BankAccount(BankCustomer customer, String accountNumber) {
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.balance = DollarAmount.ZERO_DOLLARS;
	}

	public BankCustomer getAccountHolder() {
		return customer;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public DollarAmount getBalance() {
		return balance;
	}

	public DollarAmount deposit(DollarAmount amountToDeposit) {
		balance = balance.plus(amountToDeposit);
		return balance;
	}

	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		balance = balance.minus(amountToWithdraw);
		return balance;
	}

	public void transfer(BankAccount destinationAccount, DollarAmount transferAmount) {
		balance = withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);

	}

}
