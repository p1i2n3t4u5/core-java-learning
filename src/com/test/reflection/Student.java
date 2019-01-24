package com.test.reflection;

public class Student {
	private String name;
	private int roll_No;
	
	public Student() {
		System.out.println("default constructor ");
	}
	
	public Student(String name,int roll) {
		System.out.println(name+"------"+roll);
		this.name=name;
		this.roll_No=roll;
	}
	
	public Student(String name) {
		System.out.println("name==="+name);
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.err.println(name);
		this.name = name;
	}

	public int getRoll_no() {
		return roll_No;
	}

	public void setRoll_no(int roll_no) {
		System.err.println(roll_no);
		this.roll_No = roll_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_No=" + roll_No + "]";
	}
	
	
	private void print() {
		System.err.println("printing something");
	}
	
	private static void display(String str) {
		System.err.println("displaying something "+str);
	}
	
	
}
