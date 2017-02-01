package com.techelevator;
	
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class VolunteerWorkerTest {
	
	private VolunteerWorker worker;
	
	@Before
	public void setup(){
		worker= new VolunteerWorker(0.0);
	}
	
	@Test
	public void intializes_correctly(){
		
		Assert.assertEquals(0.0,worker.getHourlyRate(), .001);
	}
	@Test
	public void test_calc_weekly_pay(){
		
		worker.calculateWeeklyPay(10);
		
		Assert.assertEquals(0.0,worker.calculateWeeklyPay(10), .001);
	}	
	
	
	

}
