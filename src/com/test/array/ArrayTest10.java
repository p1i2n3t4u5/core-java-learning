package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest10 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 6, 9, 5,40 };
		int[] arr2 = { 1, 2, 5,3, 6, 7, 9, 23, 17, 33 };
		ArrayTest10 arrayTest10 = new ArrayTest10();
		arrayTest10.approach1UnionIntersection(arr1, arr2);
		
		arrayTest10.approach2(arr1, arr2);
	}

	// approach1
	// for each value of bigger array do binary search in second array
	// this approach is applicable smaller array is sorted and the bigger is not.
	public void approach1UnionIntersection(int[] arr1, int[] arr2) {

		ArrayList<Integer> intersectionList = new ArrayList<>();
		ArrayList<Integer> unionList = new ArrayList<>();
		int[] biggerArray = null;
		int[] smallerArray = null;
		if (arr1.length > arr2.length) {
			biggerArray = arr1;
			smallerArray = arr2;
		} else {
			biggerArray = arr2;
			smallerArray = arr1;
		}

		// sort the array for binary search
		Arrays.sort(smallerArray);

		for (int value : biggerArray) {

			int returnedValue = doSearch(smallerArray, value, 0, smallerArray.length - 1);
			if (returnedValue == -1) {
				unionList.add(value);
			} else {
				intersectionList.add(smallerArray[returnedValue]);
			}
		}
		System.out.println("Intersection List:" + Arrays.toString(intersectionList.toArray()));

		for (int i : smallerArray) {
			unionList.add(i);
		}

		System.out.println("Union List:" + Arrays.toString(unionList.toArray()));

	}

	// binary search
	public int doSearch(int[] arr, int searchedNumber, int startIndex, int endIndex) {
		int midIndex = startIndex + ((endIndex - startIndex) / 2);
		if (midIndex > arr.length - 1 || midIndex < 0) {
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

	// need both arrays to be sorted
	public void approach2(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		List<Integer> intersectionList=new ArrayList<>();
		List<Integer> unionList=new ArrayList<>();
		int i = 0;
		int j = 0;
		int m = arr1.length;
		int n = arr2.length;

		while (i < m && j < n) {

			if (arr1[i] > arr2[j]) {
				unionList.add(arr2[j]);
				j++;

			} else if (arr1[i] < arr2[j]) {
				unionList.add(arr1[i]);
				i++;
			} else {
				intersectionList.add(arr1[i]);
				unionList.add(arr1[i]);
				i++;
				j++;
			}

		}
		
		while (i < m) {
			unionList.add(arr1[i]);
			i++;
		}
		while (j < n) {
			unionList.add(arr2[j]);
			j++;
		}
		
		System.out.println("Intersetion List:"+Arrays.toString(intersectionList.toArray()));
		System.out.println("Union List:"+Arrays.toString(unionList.toArray()));

	}

}
