package com.test.array;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//check if duplicate present
public class DetectDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		DetectDuplicateInArray arrayTest13 = new DetectDuplicateInArray();
		System.out.println(arrayTest13.approach1(arr));

		System.out.println(arrayTest13.approach2(arr));
		System.out.println(arrayTest13.approach3(arr));
		System.out.println(arrayTest13.approachJava8(arr));

	}

	public boolean approach1(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean approach2(int[] arr) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
		  set.add(arr[i]);
		}

		if (set.size() != arr.length) {
			return true;
		}
		return false;

	}

	public boolean approach3(int[] arr) {
		
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])) {
				return true;
			}
		}
		return false;

	}
	
	 public boolean approachJava8(int[] arr) {
	    
	   Set<Integer> set =   IntStream.of(arr).boxed().collect(Collectors.toSet());
	    
	   if (set.size() != arr.length) {
	      return true;
	    }
	    return false;
	  }

}
