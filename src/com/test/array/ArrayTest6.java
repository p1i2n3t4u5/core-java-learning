package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest6 {
	
	
	//get all sub arrays of an given array

	public static void main(String[] args) {
		int[] myArray = { 10, 20, 22, 30, 40 };

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length-i; j++) {
				 List<Integer> integers=new ArrayList<>();
				for (int k = 0+i; k < myArray.length-j; k++) {
					integers.add(myArray[k]);
				}
				 System.out.println(Arrays.toString(integers.toArray()));
			}
		}
	}
}

//10,20,22,30,40
//10,20,22,30
//10,20,22
//10,20
//10
//20,22,30,40
//20,22,30
//20,22
//20
//22,30,40
//22,30
//22
//30,40
//30
//40