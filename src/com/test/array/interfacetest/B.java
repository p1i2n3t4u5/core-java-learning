package com.test.array.interfacetest;

public class B implements A {
	
	

	public B() {
		super();
	}

	@Override
	public void write() {
		System.out.println("writing in b");
		A.super.print();
	}
	
	@Override
	public void print() {
		System.out.println("inside b");
		//System.out.println(""+A.super);
		A.super.print();
	}

}
