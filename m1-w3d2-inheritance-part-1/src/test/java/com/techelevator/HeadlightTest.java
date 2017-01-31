package com.techelevator;

import org.junit.Test;

import junit.framework.Assert;

public class HeadlightTest {
	
	@Test
	public void initializes_properly() {
		// create new headlight
		Headlight headlight = new Headlight(5000, 1, "HL57", "BurnFast", "Really Bad Products", 0.25f, 100.00f);
		
		//Assert
		Assert.assertEquals(5000, headlight.getLumens());
		Assert.assertEquals(1, headlight.getLifeInHours());
		Assert.assertEquals(expected, actual);
	
	
	
	}
	}

}
