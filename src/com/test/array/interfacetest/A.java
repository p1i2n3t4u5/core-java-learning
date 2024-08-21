package com.test.array.interfacetest;

public interface A {
	
	static void read() {
		System.out.println("read in default");
	}
	
	default void print() {
		System.out.println("print in default");
	}
	
	void write();

}
