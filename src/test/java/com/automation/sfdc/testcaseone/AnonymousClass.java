package com.automation.sfdc.testcaseone;


public class AnonymousClass {
	

	interface Animal{
		void show();
	}
	
	public abstract interface humans {
		void showHuman();
	}
	
	public static void main(String[] args) {
		
		Animal obj = new Animal() { // AnonymousClass 
			
			public void show()
			{
				System.out.println("In Show!");
			}
		};
		obj.show();
		

	}

}