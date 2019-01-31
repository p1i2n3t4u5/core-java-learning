package com.test.classobject.string;

import java.util.Arrays;

public class StringTest5 {

	public static void main(String[] args) {
		String ss = "aaabbccddeef##@123";

		char[] chars = ss.toCharArray();
		for (int i = 0,j=1; i < chars.length && j < chars.length; i++,j++) {
			
			if (chars[i]==chars[j]) {
				chars[j]='*';
				chars[j+1]='*';
				i+=2;
				j+=2;
			}
			
		}
		
		System.out.println(Arrays.toString(chars));
		
		String  s=new String(chars);
		String sss=s.replaceAll("([*])", "");
		System.out.println(sss);

	}

}
