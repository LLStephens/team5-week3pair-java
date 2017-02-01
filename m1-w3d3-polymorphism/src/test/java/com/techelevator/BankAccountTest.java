package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {

	@Test

	public void test_new_bank_account_constructor() {
		//Arrange
		BankAccount countess = new BankAccount("Her Majesty", "666");
		
		//Assert
		Assert.assertEquals("Expected Her Majesty", "Her Majesty", countess.getAccountHolderName());
		Assert.assertEquals("Expected 666",  "666", countess.getAccountNumber());
		Assert.assertEquals("Expected $0.00", "$0.00", countess.getBalance().toString());
	
	}

}
