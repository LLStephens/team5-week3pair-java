package com.techelevator;

public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	
	public BankCustomer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void setPhoneNumber (String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber (){
		return phoneNumber;
	}
	
	public String getName () {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
//	public boolean isVip(){
//		if(sum of all accounts >=25k){
//			return true;
//		}else{
//			return false;
//		}
//	}
	
}
