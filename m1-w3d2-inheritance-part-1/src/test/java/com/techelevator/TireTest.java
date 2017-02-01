package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class TireTest {
	@Test
	public void initializes_properly() {
		Tire tire = new Tire(15, 80, false, "22", "Speedmax", "Smith", 10f, 100.00f);
		
		Assert.assertEquals(15, tire.getSpeedRating());
		Assert.assertEquals(80, tire.getRecommendedPsi());
		Assert.assertFalse("Tire does not handle snow well", tire.handlesSnowWell());
		
		
	}

}
