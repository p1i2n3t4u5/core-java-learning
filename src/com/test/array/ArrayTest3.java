package com.test.array;

public class ArrayTest3 {
    // This is Binary search
	// search a particular number in sorted array
	// find a number in an array . we have to ask is it sorted array.
	// time complexity is O(log n) 
	// time complexity of linear search O(n)
	// searching for a number in an array unsorted then sort first the apply binary search

	public static void main(String[] args) {
		int num = 15;

		//Integer[] arr = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 10, 15, 17, 21, 25 }; // sorted array
		          //index 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,  10, 11, 12, 13     
		
		Integer[] arr =	{ 1, 2, 3, 4, 5, 6,  9,10 };
		
		ArrayTest3 test3 = new ArrayTest3();
		System.out.println(test3.doSearch(arr, num, 0, arr.length - 1));
	}

	private int doSearch(Integer[] arr, Integer searchedNumber, int startIndex, int endIndex) {

		int midIndex = startIndex+((endIndex - startIndex) / 2) ;
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
