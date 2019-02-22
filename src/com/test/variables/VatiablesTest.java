package com.test.variables;

public class VatiablesTest {
	
	private int a;
	private short sh;
	private long lg;
	private boolean b;
	private  double d;
	private char c;
	private float f;
	
	private String s;
	private Long ll;
	private Double dd;
	private Character cc;
	
	private static int in=10;
	

//	public static void main(String[] args) {
//		
//		//primitive types and object types
//		VatiablesTest test=new VatiablesTest();
//		//test.print();
//		
//		System.out.println(in);
//		System.out.println(test.in);
//		System.out.println(VatiablesTest.in);
//
//		System.out.println(test.a);
//		
//		
//	}
	
	public void print() {
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
		System.out.println("sh value is:"+sh);
		System.out.println("lg value is:"+lg);
		System.out.println("d value is:"+d);
		System.out.println("f value is:"+f);
		System.out.println("c value is:"+c);
		System.out.println("s value is:"+s);
		System.out.println("ll value is:"+ll);
		System.out.println("dd value is:"+dd);
		System.out.println("cc value is:"+cc);
		System.out.println(cc);
		System.out.println(VatiablesTest.in);
	}
	
	public static void staticPrint() {
		
	}
	

}
