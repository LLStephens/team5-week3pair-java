package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class DollarAmountTest {

	

	@Test

	public void toString_turns_1000_to_10() {
		
		DollarAmount money = new DollarAmount(-1000);

		Assert.assertEquals("Should be 10.00", "$10.00", money.toString());

	}

}
