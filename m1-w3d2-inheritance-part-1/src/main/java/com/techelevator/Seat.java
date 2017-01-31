package com.techelevator;

public class Seat extends AutoPart{
	private boolean includesHeater;
	private String materialType;
	

	public Seat(boolean includesHeater, String materialType, String partNumber, String name, String manufacturer, float weight, float price){
		super(partNumber, name, manufacturer, weight, price);
		this.includesHeater = includesHeater;
		this.materialType = materialType;
	}
	
	public boolean includesHeater(){
		return includesHeater;
	}
	
	public String getMaterialType(){
		return materialType;
	}
	
}
