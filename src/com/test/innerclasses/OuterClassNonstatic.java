package com.test.innerclasses;

public class OuterClassNonstatic {
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

	public class InnerClass {
		private int b = 6;
		
		private void print() {
			System.out.println("accessing non static  private member outer class:"+nonstatic_variable);
			System.out.println("accessing non static  private member outer class:"+static_variable);
			
			//calling outer class private method
			printOuter();
			//changing nonstatic variable's value
			nonstatic_variable=30;
			static_variable=50;
		}
	};

	public static void main(String[] args) {
		OuterClassNonstatic outerClassNonstatic = new OuterClassNonstatic();
		InnerClass innerClass = outerClassNonstatic.new InnerClass();
		System.out.println(innerClass.b);
		innerClass.print();
		System.out.println(outerClassNonstatic.nonstatic_variable);
		System.out.println(OuterClassNonstatic.static_variable);
		
		
	}
}
