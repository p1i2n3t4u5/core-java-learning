package com.test.immutable;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	
	public static void main(String[] args) {
		int a=10;
		String s="Niranjan";
		Map<String, String>  testMap=new HashMap<>(); 
		testMap.put("1", "hello");
		ImmutableClass immutableClass=new  ImmutableClass(a, s , testMap);
		System.out.println(immutableClass);
		
		testMap.put("2", "hi");
		System.out.println(immutableClass);
		
		immutableClass.getTestMap().put("3", "chai");
		System.out.println(immutableClass);
		
	}

}
