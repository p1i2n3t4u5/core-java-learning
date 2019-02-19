package com.test.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Collection1 {
	public static void main(String[] args) {
		String s = "Niranjan";
		char[] carray = s.toCharArray();

		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < carray.length; i++) {
			Character character = new Character(carray[i]);
			if (hashMap.keySet().contains(character)) {
				Integer value = hashMap.get(character);
				hashMap.put(character, value + 1);
			} else {
				hashMap.put(character, 1);
			}
		}
		
		for (Entry<Character, Integer> entry : hashMap.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
