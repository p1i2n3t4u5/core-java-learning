package com.test.array.interfacetest3;

public interface Interface2 {
	
	static void read() {
		System.out.println("read in Interface2 ");
	}
	
	default void print() {
		System.out.println("print in Interface2");
	}
	
	void write();

}
