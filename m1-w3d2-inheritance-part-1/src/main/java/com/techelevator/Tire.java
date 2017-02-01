package com.techelevator;

public class Tire extends AutoPart{
	private int speedRating;
	private int recommendedPsi;
	private boolean handlesSnowWell;

	
	public Tire(int speedRating, int recommendedPsi, boolean handlesSnowWell, String partNumber, String name, String manufacturer, float weight, float price) {
		super(partNumber, name, manufacturer, weight, price);
		
		this.handlesSnowWell = handlesSnowWell;
		this.recommendedPsi = recommendedPsi;
		this.speedRating = speedRating;
	}
	//only creating getters (not setters) bc these variables aren't going to change
	public int getSpeedRating(){
		return speedRating;
	}
	
	public int getRecommendedPsi(){
		return recommendedPsi;
	}
	
	public boolean HandlesSnowWell(){
		return handlesSnowWell;
	}
}
