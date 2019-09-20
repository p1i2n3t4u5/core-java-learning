package com.test.innerclasses;

public class OuterClassStatic {
	// private instance member
	private int nonstatic_variable = 5;

	// private member
	private static int static_variable = 30;

	public int getA() {
		return nonstatic_variable;
	}

	public void setA(int a) {
		this.nonstatic_variable = a;
	}

	private void printOuter() {
		System.out.println("outer print method called");
	}
	
	private static void printStatic() {
		System.out.println("outer printStatic method called");
	}


	public static class InnerClass {
		protected int b = 6;

		protected void print() {
			System.out.println("accessing non static member outer class:" + static_variable);
			static_variable = 50;
			printStatic();
		}
	};

	
}
