package com.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertionOrder {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		arrayList.add("forth");
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		System.out.println("\n");
		
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("first");
		linkedList.add("second");
		linkedList.add("third");
		linkedList.add("forth");
		
		
		for (String string : linkedList) {
			System.out.println(string);
		}

	}

}
