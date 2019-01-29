package com.test.array;

import java.util.Arrays;

public class ArrayTest9 {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 5, 2, 3, 6, 9 };

		ArrayTest9 arrayTest9 = new ArrayTest9();
		int[] integers = arrayTest9.doQuickSort(0,intArray.length-1,intArray);
		
		System.out.println(Arrays.toString(integers));

	}

	private int[] doQuickSort(int start,int end,int[] intArray) {
		
		int i = start;
        int j = end;

		int pivotIndex = i + (j - i) / 2;

		while (i <= j) {

			while (intArray[i] < intArray[pivotIndex]) {
				i++;
			}

			while (intArray[j] > intArray[pivotIndex]) {
				j--;
			}

			if (i <= j) {
				swap(i, j,intArray);
				i++;
				j--;
			}
		}
		
		// calls quickSort() method recursively
        if (start < j) {
        	doQuickSort(start, j,intArray);
        }

        if (i < end) {
        	doQuickSort(i, end,intArray);
        }

		return intArray;
	}

	private void swap(int i, int j,int[] intArray) {
		int temp=intArray[i];
		intArray[i]=intArray[j];
		intArray[j]=temp;
	}

}
