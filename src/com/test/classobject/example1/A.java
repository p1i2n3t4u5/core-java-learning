package com.test.classobject.example1;

public class A {
	
	private int a;
	private int c;
	private static int b;
	
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A class object created");
		a=0;
		b=1;
	}
	
	
	public A(int a,int c) {
		// TODO Auto-generated constructor stub
		System.out.println("A class object created");
		this.a=a;
		this.c=c;
	}
	
	public int getA() {
		return a;
	}
	
	public static int getB() {
		return b; 
	}
	
	public void incrementA() {
		a=a+1;
	}
	
	public static void incrementB() {
		b=b+1;
	}

}
