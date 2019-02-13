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
		private int b = 6;

		private void print() {
			System.out.println("accessing non static  private member outer class:" + static_variable);
			// changing nonstatic variable's value
			static_variable = 50;
			printStatic();
		}
	};

	public static void main(String[] args) {
		OuterClassStatic outerClassStatic = new OuterClassStatic();

		InnerClass innerClass = new OuterClassStatic.InnerClass();
		System.out.println(innerClass.b);
		innerClass.print();
	}

}
