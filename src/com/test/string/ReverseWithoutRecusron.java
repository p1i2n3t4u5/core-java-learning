package com.test.string;

public class ReverseWithoutRecusron {
	public static void main(String[] args) {
		String blogName = "How To Do In Java";

		StringBuilder reverseString = new StringBuilder(blogName).reverse();

		System.out.println(reverseString);
	}
}
