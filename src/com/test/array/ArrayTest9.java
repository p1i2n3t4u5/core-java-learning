package com.test.array;

import java.util.Arrays;

public class ArrayTest9 {

	// Choose a pivot value (in this case, choose the value of the middle element)
	// Initialize left and right pointers at extremes.
	// Starting at the left pointer and moving to the right, find the first element
	// which is greater than or equal to the pivot value.
	// Similarly, starting at the right pointer and moving to the left, find the
	// first element, which is smaller than pivot value
	// Swap elements found in 3 and 4.
	// Repeat 3,4,5 until left pointer is greater or equal to right pointer.
	// Repeat the whole thing for the two subarray to the left and the right of the
	// left pointer.

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 5, 2, 3, 6, 9, 6, 7, 8 };
		System.out.println("initial array:" + Arrays.toString(intArray));

		ArrayTest9 arrayTest9 = new ArrayTest9();
		int[] integers = arrayTest9.doQuickSort(0, intArray.length - 1, intArray);
		System.out.println(Arrays.toString(integers));

	}

	private int[] doQuickSort(int start, int end, int[] intArray) {
		System.out.println("doQuickSort called with:");
		System.out.println("start:"+start+"  end:"+end);
		System.out.println("intArray:"+Arrays.toString(intArray));

		int i = start;
		int j = end;

		int pivotIndex = i + (j - i) / 2;
		System.out.println("pivot element index:"+pivotIndex);

		while (i <= j) {

			while (intArray[i] < intArray[pivotIndex]) {
				i++;
			}

			while (intArray[j] > intArray[pivotIndex]) {
				j--;
			}

			if (i <= j) {
				swap(i, j, intArray);
				i++;
				j--;
			}
		}
		
		System.out.println("after rearrangeing:"+Arrays.toString(intArray));
		System.out.println("after rearrangeing  i"+i+" j:"+j);

		// calls quickSort() method recursively
		if (start < j) {
			doQuickSort(start, j, intArray);
		}

		if (i < end) {
			doQuickSort(i, end, intArray);
		}

		return intArray;
	}

	private void swap(int i, int j, int[] intArray) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
