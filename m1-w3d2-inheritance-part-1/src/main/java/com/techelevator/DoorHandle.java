package com.techelevator;

public class DoorHandle extends AutoPart {
	
	private boolean isTouchlessHandle;
	private String materialType;

	public DoorHandle(boolean isTouchlessHandle, String materialType, String partNumber, String name, String manufacturer, float weight, float price) {
		super(partNumber, name, manufacturer, weight, price);
		this.isTouchlessHandle = isTouchlessHandle;
		this.materialType = materialType;
	}
	
	public boolean isTouchlessHandle() {
		return isTouchlessHandle;
	}
	
	public String getMaterialType() {
		return materialType;
	}


}

	
