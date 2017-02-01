package com.techelevator;

public class Headlight extends AutoPart{
	private int lumens;
	private int lifeInHours;

	public Headlight(int lumens, int lifeInHours, String partNumber, String name, String manufacturer, float weight, float price) {
		super(partNumber, name, manufacturer, weight, price);
		
		this.lumens = lumens;
		this.lifeInHours = lifeInHours;
	}

	//only creating getters (not setters) bc these variables aren't going to change
	public int getLumens(){
		return lumens;
	}
	
	public int getLifeInHours(){
		return lifeInHours;
	}
}
