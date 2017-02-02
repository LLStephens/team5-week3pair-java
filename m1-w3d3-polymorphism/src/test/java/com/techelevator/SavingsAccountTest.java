package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class SavingsAccountTest {
	
	private BankCustomer customer;
	private SavingsAccount savings;
	
	
	@Before
	public void setup(){
		customer = new BankCustomer("Jane Moore", "321 Avenue");
		savings = new SavingsAccount(customer, "432");
	
		
	}
	
	@Test
	public void intializes_correctly(){
		
		Assert.assertEquals("Jane Moore", customer.getName());
		Assert.assertEquals("321 Avenue", customer.getAddress());
		Assert.assertEquals("432", savings.getAccountNumber());
		Assert.assertEquals("Expected $0.00", "$0.00", savings.getBalance().toString());
	}
	
	@Test
	public void test_withdraw_happy(){
		DollarAmount value = new DollarAmount(100000);
		DollarAmount take = new DollarAmount(50000);
		savings.deposit(value);
		savings.withdraw(take);
		
		Assert.assertEquals("Balance should be 500", "$500.00", savings.getBalance().toString());
	}
	@Test
	public void test_withdraw_with_fee(){
		DollarAmount value = new DollarAmount(20000);
		DollarAmount take = new DollarAmount(10000);
		savings.deposit(value);
		savings.withdraw(take);
		
		
		Assert.assertEquals("Balance should be -98.00", "$98.00", savings.getBalance().toString());
	
	}
	
	@Test
	public void test_overdraw_limit(){
		DollarAmount value = new DollarAmount(20000);
		DollarAmount take = new DollarAmount(30000);
		savings.deposit(value);
		savings.withdraw(take);
		
		
		Assert.assertEquals("Balance should be 200", "$200.00", savings.getBalance().toString());
	}	
	
}
