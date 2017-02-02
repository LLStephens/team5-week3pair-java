package com.techelevator;

public class CheckingAccount  extends BankAccount{

	public CheckingAccount(BankCustomer customer, String accountNumber) {
		super(customer, accountNumber);
	}
	 

	
	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		
		DollarAmount neg100 = new DollarAmount(-10000);
		DollarAmount zero = new DollarAmount(0);
		DollarAmount fee = new DollarAmount(1000);
		
		if(balance.minus(amountToWithdraw).isGreaterThanOrEqualTo(zero)) {
			super.withdraw(amountToWithdraw);
		} else if (balance.minus(amountToWithdraw.plus(fee)).isGreaterThanOrEqualTo(neg100)) {
			super.withdraw(amountToWithdraw.plus(fee));
		
			
		}
		return balance;
		
		
//		if(balance.minus(amountToWithdraw).isLessThan(neg100)){
//			return balance;
//		} else if (balance.minus(amountToWithdraw).isLessThan(zero) && balance.minus(amountToWithdraw).minus(fee).isGreaterThan(neg100)){
//			balance = balance.minus(amountToWithdraw).minus(fee);
//		} else {
//			balance = balance.minus(amountToWithdraw);
//		}
//		return balance;
	}
}
