package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SeatTest {
	@Test
	public void initializes_properly(){
		Seat seat = new Seat(true, "leather", "123", "comfy seat", "Cush Masters", 10f, 100.00f);

		Assert.assertTrue("Heater should be included", seat.includesHeater());
		Assert.assertEquals("leather", seat.getMaterialType());
		
	}
	
	
	
	
	
	
}
