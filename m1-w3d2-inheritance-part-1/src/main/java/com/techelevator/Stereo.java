package com.techelevator;

public class Stereo extends AutoPart{
	private boolean hasAuxillaryInput;
	private int heightInInches;
	private int numberOfStationPresets;
	
	public Stereo(boolean hasAuxillaryInput, int heightInInches, int numberOfStationPresets, String partNumber, String name, String manufacturer, float weight, float price){
		super(partNumber, name, manufacturer, weight, price);
		this.hasAuxillaryInput = hasAuxillaryInput;
		this.heightInInches = heightInInches;
		this.numberOfStationPresets = numberOfStationPresets;
	}
	public boolean hasAuxillaryInput(){
		return hasAuxillaryInput;
	}
	
	public int getHeightInInches(){
		return heightInInches;
	}
	
	public int getNumberOfStationPresets(){
		return numberOfStationPresets;
	}
}
