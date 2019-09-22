package com.test.string;

public class StringTest7 {
	
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		StringBuffer s2=s;
		s.append("hello");
		System.out.println(s+"  "+s2+" "+(s==s2));
		
		
	}

}
