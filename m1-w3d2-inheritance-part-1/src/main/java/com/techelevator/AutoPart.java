package com.techelevator;

public class AutoPart {
	protected String partNumber;
	protected String name;
	protected String manufacturer;
	protected float weight;
	protected float price;

	public AutoPart(String partNumber, String name, String manufacturer, float weight, float price){
		this.partNumber = partNumber;
		this.name = name;
		this. manufacturer = manufacturer;
		this.weight = weight;
		this. price = price;
	}
	
	//only creating getters for partNumber, name, manufacturer & weight bc they will never change
	public String getPartNumber(){
		return partNumber;
	}

	public String getName(){
		return name;
	}
 
	public String getManufacturer(){
		return manufacturer;
	}
	
	public float getWeight(){
		return weight;
	}
	//price gets a getter and setter bc it will likely change
	public void setPrice(float price){
		this.price = price;
	}
	
	public float getPrice(){
		return price;
	}
}

