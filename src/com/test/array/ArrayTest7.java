package com.test.array;

import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayTest7 {
	
	//find count of all characters /duplicate numbers or characters in an array
	 
	
	
	public static void main(String[] args) {
		
		String str="abbbaasssbdbdbbf";
		int[] intArray= {1,2,3,4,5,6,5,2,3,6,9};
		
		
		HashMap<Character,Integer> hashMap=new HashMap<>();
		char[] charArray= str.toCharArray();
		for (char c : charArray) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		
		for (Entry<Character, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		//count of each numbers  in an array 
		HashMap<Integer,Integer> hashMap2=new HashMap<>();
		for (int c : intArray) {
			if (hashMap2.containsKey(c)) {
				hashMap2.put(c, hashMap2.get(c)+1);
			}else {
				hashMap2.put(c, 1);
			}
		}
		
		
		for (Entry<Integer, Integer> entry : hashMap2.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
	}

}
