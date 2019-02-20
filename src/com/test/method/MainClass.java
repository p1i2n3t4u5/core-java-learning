package com.test.method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// ---------------------------------------
		// Updating String directly
		// ---------------------------------------
		String s = "Pintu";
		MainClass mainClass = new MainClass();
		mainClass.updateString(s);
		System.out.println(s);
		// ---------------------------------------
		// Updating String in List
		// ---------------------------------------
		List<String> list = new ArrayList<>();
		list.add("Pintu in list");
		mainClass.updateList(list);
		System.out.println(list.get(0));
		// ---------------------------------------
		// Updating String in Map
		// ---------------------------------------
		Map<String, String> map = new HashMap<>();
		map.put("key", "Hello in Map");
		mainClass.updateMap(map);
		System.out.println(map.get("key"));
		// ---------------------------------------
		// Updating User defined object
		// ---------------------------------------
		Student student = new Student(10, "Niranjan");
		mainClass.updateUserdefinedObject(student);
		System.out.println(student);

		// ---------------------------------------
		// Updating User immutable object
		// ---------------------------------------
		
		Dept dept=new Dept(12, "cse");
		mainClass.updateImmutableObject(dept);
		System.out.println(dept);

	}

	public void updateString(String s) {
		s = s + 1;
	}

	public void updateList(List<String> s) {
		s.set(0, s.get(0) + " Hello");
	}

	public void updateMap(Map<String, String> s) {
		s.put("key", s.get("key") + " hello");
	}

	public void updateUserdefinedObject(Student s) {
		s.setId(11);
		s.setName("Supriya");
	}

	public void updateImmutableObject(Dept d) {
	  String s=	d.getDeptName();
	  s=s+"extra";
        //d=new Dept(23, "civil");
	}

}
