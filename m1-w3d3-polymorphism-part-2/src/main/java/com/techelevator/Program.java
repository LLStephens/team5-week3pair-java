package com.techelevator;

public class Program {

	public static void main(String[] args) {
	
		Worker[] allWorkers = new Worker[] { new SalaryWorker(50000), new HourlyWorker(30), new VolunteerWorker(0)};
		
		int totalHours = 0;
		int totalPay = 0;
		System.out.println("Employee\t" + "Hours Worked\t" + "Pay");
		for(Worker workers : allWorkers) {
			String firstName = workers.getFirstName();
			String lastName = workers.getLastName();
			int hours = 5;
			Double weeklyPay = workers.calculateWeeklyPay(hours);
			totalHours += hours;
			totalPay += weeklyPay;
			
			
			System.out.println(lastName + ", " + firstName + "\t\t" + hours + "\t" + weeklyPay);
		}
		System.out.println("Total hours: " + totalHours);
		System.out.println("Total pay: " + totalPay);
		
		
	}
}
