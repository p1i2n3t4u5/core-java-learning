package com.test.classobject.example1;

public class MainClass {
	
	public static void main(String[] args) {
		A a=new A();
		A aa=new A();
		A aaa=new A();
		
		System.out.println(a.getA());
		System.out.println(aa.getA());
		
		
		System.out.println(A.getB());
		A.incrementB();
		System.out.println(A.getB());
		A.incrementB();
		System.out.println(A.getB());
		A.incrementB();
		System.out.println(A.getB());
		A.incrementB();
		A.incrementB();
		System.out.println(A.getB());
		A.incrementB();
		System.out.println(A.getB());
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println(a.getA());
		a.incrementA();
		System.out.println(a.getA());
		System.out.println(aa.getA());
		aa.incrementA();
		aa.incrementA();
		System.out.println("-----------------------------------------------------");
		System.out.println(a.getA());
		System.out.println(aa.getA());
		
		System.out.println(a.getB());
		System.out.println(aa.getB());
		
		
		A aaaa=new A(5, 3);
		
		
		
		
	}

}
