package com.techelevator;

public class SalaryWorker implements Worker {

	private double annualSalary;

	
	
	public SalaryWorker(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked){
		double pay = annualSalary/52;
		return pay;
	}

	@Override
	public String getFirstName() {
		return "Wanda";
	}

	@Override
	public String getLastName() {
		return "Weekly";
	}
	
}
