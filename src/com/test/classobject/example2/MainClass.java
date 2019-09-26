package com.test.classobject.example2;

public class MainClass {
	
	public static void main(String[] args) {
		 A a=new A();
		 A b=new B();
		 B bb=new B();
		 
		 // can never be down casted
		 //B bbb=(B)new A();
	}

}
