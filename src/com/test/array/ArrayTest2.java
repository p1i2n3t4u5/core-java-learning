package com.test.array;

public class ArrayTest2 {

	// single duplicate number

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 3, 4, 5, 6, 7, 8 };
		int length = arr.length;

		int sum = (length - 1) * length / 2;

		int actualsum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualsum += arr[i];
		}

		int duplicate = actualsum - sum;
		System.out.println(duplicate);

	}

}
