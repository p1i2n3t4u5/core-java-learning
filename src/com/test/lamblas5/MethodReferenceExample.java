package com.test.lamblas5;

public class MethodReferenceExample {

	public static void main(String[] args) {

		//Thread thread = new Thread(() -> print());
		//method reference way
		
		Thread thread = new Thread(MethodReferenceExample::print);
		thread.start();
		
		MethodReferenceExample example=new MethodReferenceExample();
		example.printWithArgument();
	}

	public static void print() {
		System.out.println("Hello");
	}
	
	public void startThread() {
		Thread thread = new Thread(this::printWithArgument);
		thread.start();
	}
	
	public  void printWithArgument() {
		System.out.println("Helllllo");
	}

}
