package com.techelevator;

public class AutoPart {
	
	protected String partNumber;
	protected String name;
	protected String manufacturer;
	protected float weight;
	protected float price;
}

public AutoPart(String partNumber, String name, String manufacturer, float weight, float price) {
	this.partNumber = partNumber;
	this.name = name;
	this.manufacturer = manufacturer;
	this.weight = weight;
	this.price = price;
}

public String getPartNumber() {
	return partNumber;
}

public String getName() {
	return name;
}

public String getManufactuerer() {
	return manufacturer;
}

public float  getWeight() {
	return weight;
}

public void setPrice(float price) {
	this.price = price;
}

public float getPrice() {
	return price;
}

}