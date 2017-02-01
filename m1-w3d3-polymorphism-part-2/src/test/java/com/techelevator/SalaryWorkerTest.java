package com.techelevator;



import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class SalaryWorkerTest {
	
	private SalaryWorker worker;
	
	@Before
	public void setup(){
		worker= new SalaryWorker(52000);
	}
	
	@Test
	public void intializes_correctly(){
		
		Assert.assertEquals(52000,worker.getAnnualSalary(), .001);
	}
	@Test
	public void test_calc_weekly_pay(){
		
		worker.calculateWeeklyPay(40);
		
		Assert.assertEquals(1000,worker.calculateWeeklyPay(40), .001);
	}	

	

}
