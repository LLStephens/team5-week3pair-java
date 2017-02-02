package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	
	public BankCustomer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	List<BankAccount> custAcct = new ArrayList<BankAccount>();
	
	public void addAcct(BankAccount acct){
		custAcct.add(acct);
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
	
	public boolean isVip(){
		DollarAmount total = new DollarAmount(0);
		for(BankAccount acct : custAcct){
			total = total.plus(acct.getBalance());
		}
		if(total.isGreaterThanOrEqualTo(new DollarAmount(2500))){
			return true;
		}else{
			return false;
		}
	}
	
}
