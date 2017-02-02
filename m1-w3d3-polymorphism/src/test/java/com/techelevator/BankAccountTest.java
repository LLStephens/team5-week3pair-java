package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {

	@Test

	public void test_new_bank_account_constructor() {
		//Arrange
		BankCustomer customer = new BankCustomer("Joe Filly", "123 Main St");
		BankAccount account = new BankAccount(customer, "666");
		
		//Assert
		Assert.assertEquals("Expected 123 Main St", "123 Main St", customer.getAddress());
		Assert.assertEquals("Expected Joe Filly", "Joe Filly", customer.getName());
		Assert.assertEquals("Expected 666",  "666", account.getAccountNumber());
		Assert.assertEquals("Expected $0.00", "$0.00", account.getBalance().toString());
	
	}

}
