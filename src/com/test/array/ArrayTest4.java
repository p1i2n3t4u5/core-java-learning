package com.test.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayTest4 {

	// find all pair of numbers whose sum is given number
	// question we have to ask
	// does the array contains negative numbers also
	// repeated numbers should be considered?
	// how big is the array for considering space complexity

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 7, 8, 9, 4, 5, 7, 17, 23, 6, 11, 13, 12 };
		int givenNumber = 15;
		ArrayTest4 obj = new ArrayTest4();
		obj.approach1(a, givenNumber);
		obj.approach2(a, givenNumber);
		obj.approach3(a, givenNumber);
	}

	//complexity will n2 
	public void approach1(int[] a, int givenNumber) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (givenNumber == a[i] + a[j]) {
					System.out.println("The pair:" + a[i] + "," + a[j]);
				}
			}
		}

		System.out.println("approach 1 ends here");
	}

	public void approach2(int[] a, int givenNumber) {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {

			int targetNumber = givenNumber - a[i];

			if (set.contains(targetNumber)) {
				System.out.println("The pair:" + a[i] + "," + targetNumber);
			} else {
				set.add(a[i]);
			}
		}

		System.out.println("approach 2 ends here");
	}

	public void approach3(int[] a, int givenNumber) {
		Arrays.sort(a);
		int l = 0;
		int r = a.length - 1;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(",");
			System.out.println();
		}
		

		while (l < r) {
			int sum = a[l] + a[r];
			if (sum == givenNumber) {
				System.out.println("The pair:" + a[l] + "," + a[r]);
				l++;
				r--;
			} else if (sum < givenNumber) {
				l++;

			} else if (sum > givenNumber) {
				r--;
			}
		}

		System.out.println("approach 3 ends here");
	}

}
