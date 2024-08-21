package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBasics {

	public static void main(String[] args) {
		int[] myIntArray = new int[5];
		String[] strArray = new String[5];
		int[] myInteArray = { 1, 2, 3, 4, 5, 6 };
		

		int num = 10;
		System.out.println("array length:" + myIntArray.length);
		for (int i = 0; i < myInteArray.length - 1; i++) {
			myIntArray[i] = num++;                         // post incrementer will assign first then increase the value
			System.out.println(myIntArray[i]);
		}

		// printing an array
		System.out.println(myIntArray);
		System.out.println(Arrays.toString(myIntArray));

		int[] copyArray = new int[myIntArray.length];
		int index = 0;
		for (int value : myIntArray) {
			copyArray[index] = value;
			index++;
		}

		System.out.println(Arrays.toString(copyArray));
		System.out.println("copy array with clone approach");

		// copy array with clone approach
		int[] copyArray2 = myIntArray.clone();
		copyArray2[0]++;
		System.out.println(Arrays.toString(copyArray2));
		System.out.println(Arrays.toString(myIntArray));
		System.out.println("copy array using System class");

		// copy array using System class
		int[] copyArray3 = new int[myIntArray.length];
		System.arraycopy(myIntArray, 0, copyArray3, 0, myIntArray.length);
		System.out.println(Arrays.toString(copyArray3));

		System.out.println("copy array will not work ");
		// copy array will not work
		int[] copyArray4 = myIntArray;
		copyArray4[0]++;
		++copyArray4[1];
		copyArray4[2]=copyArray4[2]+5;
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(copyArray4));
		System.out.println("incrementing element in one array will increment of other array");

		// String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

		Integer[] geeks = { 10, 29, 34, 55 };

		// Conversion of array to ArrayList
		// using Arrays.asList
		List<Integer> al = Arrays.asList(geeks);
		System.out.println(al);
		System.out.println(al.size());

		// al.add(34);
		// this will throw error  Arrays.asList returns an immutable object

		List<Integer> newList = new ArrayList<>(al);
		newList.add(56);

		System.out.println(Arrays.toString(newList.toArray()));

		Integer[] geeks2 = new Integer[10];
		Integer[] geeks3 = newList.toArray(geeks2);
		
		System.out.println(geeks2+" "+geeks3);
		System.out.println(Arrays.toString(geeks2));
		System.out.println(Arrays.toString(geeks3));
		System.out.println(geeks2 == geeks3);
		System.out.println(geeks2.equals( geeks3));
		
		 Object[] o = new Object[10];
		  int a =10;
		  o[0] = a;
		  o[1] = "aaa";
		  o[2] = true;
		  System.out.println(o);
		  for (int i = 0; i < o.length; i++) {
			System.out.println(o[i] );
		}
		  

	}

}
