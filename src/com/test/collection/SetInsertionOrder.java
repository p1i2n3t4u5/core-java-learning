package com.test.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInsertionOrder {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("first");
		hashSet.add("second");
		hashSet.add("third");
		hashSet.add("fourt");
		hashSet.add("fifth");
		
		for (String ss : hashSet) {
			System.out.println(ss);
		}
		
		System.out.println("--------------------");
		
		
		Set<String> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("first");
		linkedHashSet.add("second");
		linkedHashSet.add("third");
		linkedHashSet.add("fourt");
		linkedHashSet.add("fifth");
		
		
		for (String ss : linkedHashSet) {
			System.out.println(ss);
		}

	}

}
