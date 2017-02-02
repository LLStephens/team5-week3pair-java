package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {
	
	private BankCustomer customer;
	private BankAccount savings1;
	private BankAccount checking1;
	private BankAccount checking2;
	private DollarAmount value;
	private DollarAmount value2;
	
	@Before
	public void setup(){
		customer = new BankCustomer("Joe Filly", "123 Main St");
		savings1 = new SavingsAccount(customer, "123");
		checking1 = new CheckingAccount(customer, "456");
		checking2 = new CheckingAccount(customer, "789");
	
	}
	
	@Test
	public void test_vip(){
	
		value = new DollarAmount(100000000);
		value2 = new DollarAmount(500);
		checking1.deposit(value);
		checking2.deposit(value2);
		savings1.deposit(value2);
		
		Assert.assertTrue("Should be VIP", customer.isVip());
	}
	
	@Test
	public void test_not_vip(){
		value = new DollarAmount(1000);
		value2 = new DollarAmount(500);
		checking1.deposit(value);
		checking2.deposit(value2);
		savings1.deposit(value2);
		
		Assert.assertFalse("Should not be VIP", customer.isVip());
	}
	
	@Test
	public void test_return_phone_number() {
		
		customer.setPhoneNumber("6145555555");
		
		Assert.assertEquals("Expected 6145555555", "6145555555", customer.getPhoneNumber());
		
	}
	
	
}
