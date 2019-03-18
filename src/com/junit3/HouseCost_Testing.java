package com.junit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseCost_Testing {
	//Creating test object for House_Cost Class
	House_Cost test=new House_Cost();

	/*choose your options 
	 * 1.standard material
	 * 2.above standard material
	 * 3. high standard material
	 * 4.automated home and highly standard material
	 */
	@Test
	void Housetest_pass() {
		//test cases for standard materials
		assertEquals(180000,test.cost(1,150),"This method Executed Successfully");//Calling the cost() which is in the House_Cost Class 
		assertEquals(936000,test.cost(1,780),"This method Executed Successfully");
		assertEquals(1068720,test.cost(1,890.6),"This method Executed Successfully");
		
		//test cases for above standard materials
		assertEquals(2250000,test.cost(2,1500),"This method Executed Successfully");
		assertEquals(3000000,test.cost(2,2000),"This method Executed Successfully");
		assertEquals(1148700,test.cost(2,765.8),"This method Executed Successfully");
		
		//test cases for high standard materials
		assertEquals(1476000,test.cost(3,820),"This method Executed Successfully");
		assertEquals(3165840,test.cost(3,1758.8),"This method Executed Successfully");
		assertEquals(13777200,test.cost(3,7654),"This method Executed Successfully");
		
		//test cases fully automated home 
		assertEquals(4995000,test.cost(4,1998),"This method Executed Successfully");
		assertEquals(2247500,test.cost(4,899),"This method Executed Successfully");
		assertEquals(4387250,test.cost(4,1754.9),"This method Executed Successfully");
	}
	@Test
	
	void HouseTest_fail()
	{
		/* fail test cases for cost() */
		
		assertFalse(658800!=test.cost(1,549),"Executed sSuccessfully");
		assertFalse(12711000!=test.cost(2,8474),"Executed sSuccessfully");
		assertFalse(69738300!=test.cost(3,38743.5),"Executed sSuccessfully");
		assertFalse(21847500!=test.cost(4,8739),"Executed sSuccessfully");
	}

}
