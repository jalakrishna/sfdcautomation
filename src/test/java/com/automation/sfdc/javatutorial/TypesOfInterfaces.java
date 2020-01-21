package com.automation.sfdc.javatutorial;

public class TypesOfInterfaces {

	public abstract interface iPadsModels{
		void showIPadModels();
	}
	
	
	interface computerModels{
		void showComputerModels();
	
	}
	
	
	public static void main(String[] args) {
		

		computerModels obj = new computerModels()
		{
			@Override
			public void showComputerModels() {
				System.out.println("Lenevo");	
			}
		};
		
		iPadsModels obj2 = () -> System.out.println("");
		obj2.showIPadModels();
		
	}

}
