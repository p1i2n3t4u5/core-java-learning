package com.test.classobject;

public class Student {
	private String name;
	private int roll_No;

	public String getName() {
		System.out.println("getName called");
		return name;
	}

	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}

	public int getRoll_no() {
		return roll_No;
	}

	public void setRoll_no(int roll_no) {
		System.out.println(roll_no);
		this.roll_No = roll_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_No=" + roll_No + "]";
	}
	
	
}
