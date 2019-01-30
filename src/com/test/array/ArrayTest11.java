package com.test.array;

import java.util.Arrays;

public class ArrayTest11 {
	
	//There is an array with every element repeated twice except one. Find that element
	
	public static void main(String[] args) {
		int[] arr={1, 1, 2, 2, 3, 4, 4, 5, 5};
		
		int length=arr.length;
		int n=length+1; // assuming all are present twice
		
		int halfLength=n/2;
		
		// sum assuming all present twice
		
		int sum = halfLength *(halfLength+1);
		System.out.println(sum);
		
		int sum2=0;
		//sum of arrau elements
		for (int i : arr) {
			sum2+=i;
		}
		System.out.println(sum2);
		
		System.out.println("missing number:"+(sum-sum2));
	}

}
