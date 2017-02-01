package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StereoTest {
	@Test
	public void initializes_properly(){
		Stereo stereo = new Stereo(true, 10, 20, "123", "Rockstar", "MusicMaker", 20f, 200f);
	
		//Assert
		
		Assert.assertEquals("should have 20 station presets", 20, stereo.getNumberOfStationPresets());
		Assert.assertEquals("should be 10", 10, stereo.getHeightInInches());
		Assert.assertTrue("Stereo has auxillary Input", stereo.hasAuxillaryInput());
	
	}

}
