package com.test.array.interfacetest2;

public interface A {
	
	static void read() {
		System.out.println("read in B ");
	}
	
	default void print() {
		System.out.println("print in A");
	}
	
	void write();

}
