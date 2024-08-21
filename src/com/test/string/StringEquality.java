package com.test.string;

public class StringEquality {
	public static void main(String[] args) {
		
		String s1=new String("abc");
		String s2=new String("abc");
		
		String s3="abc";
		String s4="abc";
		if (s1==s2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		if (s1==s3) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		if (s3==s4) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		if (s1.intern()==s2.intern()) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
    if (s1.intern()==s3) {
      System.out.println("equal");
    }else {
      System.out.println("not equal");
    }
    
		
	}
}
