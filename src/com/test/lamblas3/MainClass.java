package com.test.lamblas3;

public class MainClass {
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("run method in Runnable");
			}});
		
		thread.run();
		
		// creating inline lambda
		Thread thread2=new Thread(()-> System.out.println("run method in Lambda"));
		thread2.run();
		
	}

}
