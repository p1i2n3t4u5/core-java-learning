package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest10 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		ArrayTest10 test10=new ArrayTest10();
		
        int[] arr1= { 1, 2, 3, 4, 5, 6,  9 };
        int[] arr2= { 1, 2, 3, 6,7,  9,23,17,33 };
        int[] biggerArray=null;
        int[] smallerArray=null;
        if (arr1.length > arr2.length) {
			biggerArray=arr1;
			smallerArray=arr2;
		}else {
			biggerArray=arr2;
			smallerArray=arr1;
		}
        
        for (int i : biggerArray) {
        	
        	int returnedValue=test10.doSearch(smallerArray, i, 0, smallerArray.length-1);
        	if (returnedValue == -1) {
				
			} else {
				arrayList.add(smallerArray[returnedValue]);
			}
		}
        
        
        System.out.println(Arrays.toString(arrayList.toArray()));
        
	}
	
	
	
	public int doSearch(int[] arr, int searchedNumber, int startIndex, int endIndex) {
		

		int midIndex = startIndex+((endIndex - startIndex ) / 2) ;
		
		if (midIndex > arr.length-1 || midIndex < 0) {
			return -1;
		}
		
		Integer midElement = arr[midIndex];

		if (startIndex > endIndex) {

			return -1;

		} else {
			if (searchedNumber == midElement) {
				return midIndex;
			} else if (searchedNumber > midElement) {
				return doSearch(arr, searchedNumber, midIndex + 1, endIndex);
			} else {
				return doSearch(arr, searchedNumber, startIndex, midIndex - 1);
			}
		}

	}

}
