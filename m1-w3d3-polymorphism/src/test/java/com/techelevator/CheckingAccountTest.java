package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class CheckingAccountTest {
	
	private BankCustomer customer;
	private CheckingAccount checkers;
	
	@Before
	public void setup(){
		customer= new BankCustomer("Julie Simmons", "987 Smart Rd");
		checkers= new CheckingAccount(customer, "321");
	}
	
	@Test
	public void intializes_correctly(){
		
		Assert.assertEquals("Julie Simmons", customer.getName());
		Assert.assertEquals("987 Smart Rd", customer.getAddress());
		Assert.assertEquals("321", checkers.getAccountNumber());
		Assert.assertEquals("Expected $0.00", "$0.00", checkers.getBalance().toString());
	}
	
	@Test	
	public void test_withdraw_happy(){
		DollarAmount value = new DollarAmount(1000);
		DollarAmount take = new DollarAmount(500);
		checkers.deposit(value);
		checkers.withdraw(take);
		
		Assert.assertEquals("Balance should be 5", "$5.00", checkers.getBalance().toString());
	}
	
	@Test
	public void test_withdraw_with_fee(){
		DollarAmount value = new DollarAmount(1000);
		DollarAmount take = new DollarAmount(2000);
		checkers.deposit(value);
		checkers.withdraw(take);
		
		
		Assert.assertEquals("Balance should be -10.00", "$-20.00", checkers.getBalance().toString());
	}
	
	@Test
	public void test_overdraw_limit(){
		DollarAmount value = new DollarAmount(1000);
		DollarAmount take = new DollarAmount(11000);
		checkers.deposit(value);
		checkers.withdraw(take);
		
		
		Assert.assertEquals("Balance should be 10", "$10.00", checkers.getBalance().toString());
	}	
		
		
		
		
		
	
}
