package com.techelevator;

public class WindshieldWiper extends AutoPart{
	private int length;
	private boolean isDriverSide;
	
	public WindshieldWiper(int length, boolean isDriverSide, String partNumber, String name, String manufacturer, float weight, float price) {
		super(partNumber, name, manufacturer, weight, price);
		this.length = length;
		this.isDriverSide = isDriverSide;
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean isDriverSide() {
		return isDriverSide;
	}
	

}
