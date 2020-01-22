package com.automation.sfdc.javatutorial;

public interface mobileModels2019 {
	 
		  default String getMobileName(){
			  String name = "Samsung";
			  return name;
		  }
		  
		  public default String getMobileModel(){
			  String modelNo = "12345";
			   return modelNo;
		  }
		  
		  static String getMobileYear(){
			  String mobileYear = "2003";
			  return mobileYear;
		  }
		  
		  void showMobileModels();
		 	
}


class mobileModelClass implements mobileModels2019 {

	@Override
	public void showMobileModels() {
		
	}
	
	mobileModelClass obj =  new mobileModelClass();

	
}
