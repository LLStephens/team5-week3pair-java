package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DoorHandleTest {
	@Test
	public void intializes_properly(){
		DoorHandle handle = new DoorHandle(true, "plastic", "666", "Evil Door Handle", "Lucifer Co", 1f, 1000.00f);
	
		//Assert
		Assert.assertTrue("This is a touchless handle", handle.isTouchlessHandle());
		Assert.assertEquals("plastic", handle.getMaterialType());
		
	}
}
