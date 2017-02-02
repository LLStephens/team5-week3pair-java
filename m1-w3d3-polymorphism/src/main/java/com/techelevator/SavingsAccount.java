package com.techelevator;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(BankCustomer customer, String accountNumber) {
		super(customer, accountNumber);
	
	}
	
	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw){
		DollarAmount min = new DollarAmount(15000);
		DollarAmount fee = new DollarAmount(200);
		
		if(!(balance.minus(amountToWithdraw).isNegative()) && balance.minus(amountToWithdraw).isLessThan(min)){
			super.withdraw(amountToWithdraw.plus(fee));
		} else if(balance.minus(amountToWithdraw).isNegative()){
			return balance;
		}else{
			super.withdraw(amountToWithdraw);
		}
		return balance;
	}
	
}
