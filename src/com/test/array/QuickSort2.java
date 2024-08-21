package com.test.array;

import java.util.Arrays;

public class QuickSort2 {

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

		QuickSort2 arrayTest9 = new QuickSort2();
		int[] integers = arrayTest9.doQuickSort(0, intArray.length - 1, intArray);
		System.out.println(Arrays.toString(integers));

	}

  private int[] doQuickSort(int start, int end, int[] intArray) {
    
   int  pivotIndex  = start + (end-start)/2;
   int i = start;
   int j = end;
   
   while(i < j) {
     
     while(intArray[i] < intArray[pivotIndex]) {
       i++;
     }
     
     while(intArray[j] > intArray[pivotIndex]) {
       j--;
     }
     
     if(i <= j) {
       swap(i, j, intArray);
       i++;
       j--;
     }
   }
   
   if(i < end) {
     doQuickSort(i, end, intArray);
   }
   
   if( start < j) {
     doQuickSort(start, j, intArray);
   }
   
    
    
    
    return intArray;
  }

  private void swap(int i, int j, int[] intArray) {
    int temp = intArray[i];
    intArray[i] = intArray[j];
    intArray[j] = temp;
  }

}
