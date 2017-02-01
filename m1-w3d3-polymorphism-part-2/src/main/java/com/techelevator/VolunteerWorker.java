package com.techelevator;

public class VolunteerWorker implements Worker{

	private double hourlyRate;

	
	
	public VolunteerWorker(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked){
		double pay = hourlyRate * hoursWorked;
		return pay;
	}

	@Override
	public String getFirstName() {
		return "Sheila";
	}
	

	@Override
	public String getLastName() {
		return "Sweet";
	}
	
	
}
