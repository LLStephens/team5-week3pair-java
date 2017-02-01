package com.techelevator;

public class HourlyWorker implements Worker {

	private double hourlyRate;

	
	
	public HourlyWorker(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked){
		double pay = hourlyRate * hoursWorked;
			if(hoursWorked > 40){
				pay = pay + (hourlyRate * (hoursWorked - 40) * 0.5);
			} else {
				return pay;
			}
		return pay;
	}

	@Override
	public String getFirstName() {
		return "Paul";
	}
	

	@Override
	public String getLastName() {
		return "Jones";
	}
	
}
