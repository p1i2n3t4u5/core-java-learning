package com.test.string;

public class StringReversalUsingRecursion {

	public static void main(String[] args) {
		String blogName = "How To Do In Java ";

		String reverseString = reverseString(blogName);

		System.out.println(reverseString);
	}

	public static String reverseString(String string) {
		if (string.isEmpty()) {
			return string;
		}
		// Calling function recursively
		return reverseString(string.substring(1)) + string.charAt(0);
	}
}
