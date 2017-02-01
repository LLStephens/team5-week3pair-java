package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
 

public class HeadlightTest {
	@Test
	public void initializes_properly(){
		Headlight headlight = new Headlight(5000, 1, "HL57", "BurnFast", "ReallyBadProducts", 0.25f, 100.00f);
	
		//Assert
		Assert.assertEquals(5000, headlight.getLumens());
		Assert.assertEquals(1, headlight.getLifeInHours());
	
	}
}
