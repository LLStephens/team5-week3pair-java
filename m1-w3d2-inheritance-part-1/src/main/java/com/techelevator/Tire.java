package com.techelevator;

public class Tire extends AutoPart {

	//Start with list of stuff - they're your member variables
	//Decide their types
	private int speedRating;
	private int recommendedPSI;
	private boolean handlesSnowWell;
	
	public Tire(int SpeedRating, int recommendedPSI, boolean handlesSnowWell, String partNumber, String name, String manufacturer, float weight, float price) {
		super(partNumber, name, manufacturer, weight, price);
		
		this.speedRating = speedRating;
		this.recommendedPSI = recommendedPSI;
		this.handlesSnowWell = handlesSnowWell;

	}
	
	public int getSpeedRating() {
		return speedRating;
	}
	
	public getRecommendedPSI() {
		return recommendedPSI;
	}
	
	public getHandlesSnowWell() {
		return handlesSnowWell;  //tip for boolean values- want it to read like a sentence. So it fits well in an if. "if tire.handlesSnowWell then do something"
	}
	
	public 
}


