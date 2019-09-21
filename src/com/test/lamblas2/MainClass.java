package com.test.lamblas2;

public class MainClass {
	
	public static void main(String[] args) {
		LengthInterface lengthInterface=(String s) -> s.length(); 
		System.out.println(lengthInterface.getLength("Hello world"));
		
		// shortcuts for creating lambdas
		LengthInterface lengthInterface2=(s) -> s.length(); 
		//no need to mention type . This is applicable to more than one argument also
		System.out.println(lengthInterface2.getLength("Hello world"));
		LengthInterface lengthInterface3=s -> s.length(); 
		//no need to keep the braces for single argument
		System.out.println(lengthInterface3.getLength("Hello world"));
		
	}
	
	
}


