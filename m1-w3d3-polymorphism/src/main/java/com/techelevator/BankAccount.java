package com.techelevator;

public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	protected DollarAmount balance;

	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = DollarAmount.ZERO_DOLLARS;
	}

	public String getAccountHolderName() {
		return accountHolderName;
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
