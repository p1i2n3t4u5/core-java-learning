package com.test.array;

public class FindMissingNumberArray {

	// find the missing number

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 6, 7, 8 };
		// (n*(n+1))/2    n = last number
		Integer sum = 0;
		for (Integer integer : arr) {
			sum += integer;
		}
		System.out.println(sum);

		Integer actualsum = (arr[arr.length-1]*(arr[arr.length-1]+1))/2;// (n*(n+1))/2

		Integer missing = actualsum - sum;
		System.out.println(missing);

	}

}
