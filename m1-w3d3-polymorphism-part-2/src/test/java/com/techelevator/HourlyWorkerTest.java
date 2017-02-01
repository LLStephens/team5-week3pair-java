

package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
public class HourlyWorkerTest {
	
	private HourlyWorker worker;
	
	@Before
	public void setup(){
		worker= new HourlyWorker(10);
	}
	
	@Test
	public void intializes_correctly(){
		
		Assert.assertEquals(10, worker.getHourlyRate(), .001);
	}
	@Test
	public void test_calc_weekly_pay(){
		
		worker.calculateWeeklyPay(20);
		
		Assert.assertEquals(200,worker.calculateWeeklyPay(20), .001);
	}	
	
	@Test
	public void test_calc_weekly_pay_overtime(){
		
		worker.calculateWeeklyPay(60);
		
		Assert.assertEquals(700, worker.calculateWeeklyPay(60), .001);
	}	
	
	
	

}

