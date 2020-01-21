package com.automation.sfdc.testcaseone;



public class TypesOfInterfaces extends AnonymousClass {
	
	/*
	 * Marker Interface - Interface without any methods
	 * SAM --> Single abstract method
	 * Narmal
	 * SAM interface is also called as functional interface in java 1.8, there are some advantages 
	 * 
	 */
	
	public abstract interface Cars {
		public void showCars();
		//public void demoCars();
	}
	
	interface bikes extends Cars { // Interfaces supports multiple inheritances 
		
	}
	
	public static void main(String[] args) {
		
		Cars obj = new Cars()
		{
			public void showCars()
			{
			System.out.println("In Card 0");	
			}

			
		};
	   
		Cars obj1 = () -> 
			{
				System.out.println("In Cars");
			};
		
		Cars obj2 = () ->  System.out.println("In Cars 2");
		obj2.showCars();
		

			
		humans obj4 = new humans()
		{
			public void showHuman()
			{
			System.out.println("Humans Inn");	
			}
		};

	}


}
