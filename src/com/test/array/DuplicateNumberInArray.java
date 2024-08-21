package com.test.array;

public class DuplicateNumberInArray {

	// single duplicate number

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 3, 4, 5, 6, 7, 8 ,9,10};
		int length = arr.length;
        // ((n-1)*n)/2    n = length
		int sum = ((length - 1) * length) / 2;
		System.out.println(sum);

		int actualsum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualsum += arr[i];
		}

		int duplicate = actualsum - sum;
		System.out.println(duplicate);

	}

}
