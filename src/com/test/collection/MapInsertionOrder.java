package com.test.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MapInsertionOrder {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("one", "one");
		hashMap.put("two", "two");
		hashMap.put("three", "three");
		hashMap.put("four", "four");
		hashMap.put("five", "five");
		
		for (Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println("---------------------------------");
		
		HashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("one", "one");
		linkedHashMap.put("two", "two");
		linkedHashMap.put("three", "three");
		linkedHashMap.put("four", "four");
		linkedHashMap.put("five", "five");
		
		for (Entry<String, String> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}

}
