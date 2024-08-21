package com.test.array;

import java.util.Arrays;

public class ReverseAnArray {
	// reverse array in-place
	// reverse using second array

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		ReverseAnArray arrayTest14 = new ReverseAnArray();
		arrayTest14.approach1(arr);
	}

	public void approach1(int[] arr) {

		// inplace reverse approach
	    int length=	arr.length;
		int halfLength = arr.length / 2;

		for (int i = 0; i < halfLength; i++) {
			swap(arr, i,length-1-i);
		}

		System.out.println(Arrays.toString(arr));
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void approach2(int[] arr) {
		int length=arr.length;
		int[]  newArray=new int[arr.length];
		for (int i = length-1; i >= 0; i--) {
			newArray[length-1-i]=arr[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
	

}
