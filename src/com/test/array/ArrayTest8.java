package com.test.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayTest8 {
	// remove duplicates from an array or string

	public static void main(String[] args) {
		String str = "abbbaasssbdbdbbf";
		int[] intArray = { 1, 2, 3, 4, 5, 6, 5, 2, 3, 6, 9 };
		
		ArrayTest8 arrayTest8=new ArrayTest8();
		arrayTest8.approach1(str, intArray);
		
		arrayTest8.approach2(str, intArray);
	}

	public void approach1(String str, int[] intArray) {
		System.out.println("approach 1 starts");
		//benefits of this approach no extra memory needed
		// no need to use collection apis
		// time complexity will be nlog(n)+n 
		//does not keep the order
		
		char[] charArray = str.toCharArray();

		// sort them
		Arrays.sort(charArray);
		Arrays.sort(intArray);

		char temp = charArray[0];
		for (int i = 1; i < charArray.length; i++) {
			if (temp == charArray[i]) {
				charArray[i]='*';
			}else {
				temp=charArray[i];
			}
		}
			
		System.out.println(Arrays.toString(charArray));
		
		
		int temp2 = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (temp2 == intArray[i]) {
				intArray[i]=-1;
			}else {
				temp2=intArray[i];
			}
		}
		System.out.println(Arrays.toString(intArray));
		
		System.out.println("approach 1 ends");
	}

	public void approach2(String str, int[] intArray) {
		System.out.println("approach 2 starts");
		
		Set<Character> charSet=new LinkedHashSet<>();
		Set<Integer> intSet=new LinkedHashSet<>();
		
		for (int i = 0; i < intArray.length; i++) {
			intSet.add(intArray[i]);
		}
		System.out.println(Arrays.toString(intSet.toArray()));
		
	  char[] charArray=	str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		}
		System.out.println(Arrays.toString(charSet.toArray()));
		System.out.println("approach 2 ends");
	}


}
