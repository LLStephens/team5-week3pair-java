package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AutoPartTest {
	private AutoPart part;

	@Before
	public void setup(){
		part = new AutoPart("4321", "some part", "some manufacturer", 10f, 50.00f);
	}
	
	@Test
	public void initializes_properly(){
		//AutoPart part = new AutoPart("4321", "some part", "some manufacturer", 10f, 50.00f);
		
		Assert.assertEquals("The part number is 4321", "4321", part.getPartNumber());
		Assert.assertEquals("The name is some part",  "some part", part.getName());
		Assert.assertEquals("The manufacturer is some manufacturer", "some manufacturer", part.getManufacturer());
		Assert.assertEquals("The weight is 10", 10.00f, part.getWeight(), 0.001);
		Assert.assertEquals("Price is 50", 50.00f, part.getPrice(), 0.001);
	}
	@Test
	public void sets_price_from_50_to_150(){
		part.setPrice(150.00f);
		
		Assert.assertEquals("Price should be 150.00", 150.00f, part.getPrice(), 0.001);
	
	}
}
