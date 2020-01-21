package com.automation.sfdc.javatutorial;

public class methodsUsingLambdaExpressions {

	public static void main(String[] args) {
	
		methodsUsingLambdaExpressions obj = new methodsUsingLambdaExpressions();
		String name = obj.getUserName();
		System.out.println(name);
	}
	
	
	public String getUserName(){
		String name = "Jalakrishna";
		return name;
	}
	
	public String getPassword(){
		String password = "selenium";
		return password;
	}

}
