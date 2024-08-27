package com.test.array.interfacetest3;

public interface Interface1 {
	
	static void read() {
		System.out.println("read in Interface1 ");
	}
	
	default void print() {
		System.out.println("print in Interface1");
	}
	
	void write();

}
