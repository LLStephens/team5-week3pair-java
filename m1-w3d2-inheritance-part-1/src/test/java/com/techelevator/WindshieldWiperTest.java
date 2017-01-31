package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class WindshieldWiperTest {
	@Test
	
	public void initializes_properly() {
		WindshieldWiper wiper = new WindshieldWiper(10, true, "12", "wipey", "wipemaster", 10f, 100f);
		
		Assert.assertEquals("Expected 10", 10, wiper.getLength());
		Assert.assertTrue("expected is driverside", wiper.isDriverSide());
	}

}
