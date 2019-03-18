package com.junit3;

public class House_Cost {
	public double cost(int choice,double area)
	{
		//Initializing the total_cost to zero
		double total_cost=0;
		/* here choice refers standard material chosen by the user */
		
		/*choose your options 
		 * 1.standard material
		 * 2.above standard material
		 * 3. high standard material
		 * 4.automated home and highly standard material
		 */
		switch(choice)
		{

		case 1: total_cost=area*1200.0;/* calculating the total cost based on the user choice and area */ 
				break;
		case 2: total_cost=area*1500.0;
				break;
		case 3: total_cost=area*1800.0;
				break;
		case 4: total_cost=area*2500.0;
				break;
		
		}
		return total_cost; /* returning the total cost of house */
		
		
	}

}
