package com.test.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringTest1 {

	public static void main(String[] args) {
		StringTest1 stringTest1 = new StringTest1();
		String s = "i am legened";
		stringTest1.approach1(s);
		stringTest1.approach2(s);
		stringTest1.approach3(s);
		stringTest1.approach4(s);
		stringTest1.approach5(s);

		stringTest1.reverse("abc");

	}

	public void approach1(String s) {
		char[] newArray = new char[s.length()];

		char[] chars = s.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			newArray[chars.length - i - 1] = chars[i];
		}

		System.out.println(Arrays.toString(newArray));

		String string = new String(newArray);
		System.out.println(string);

		String string2 = String.valueOf(newArray);
		System.out.println(string2);

	}

	public void approach2(String s) {
		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();
		System.out.println(buffer.toString());
	}

	public void approach3(String s) {
		char[] array = s.toCharArray();
		List<Character> list = new ArrayList<>();
		for (char c : array) {
			list.add(c);
		}

		char[] newCharArray = new char[s.length()];
		Collections.reverse(list);
		int i = 0;
		for (Character character : list) {
			newCharArray[i] = character;
			i++;
		}

		String rev = new String(newCharArray);
		System.out.println(rev);

	}

	public void approach4(String s) {
		StringBuilder buffer = new StringBuilder(s);
		buffer.reverse();
		System.out.println(buffer.toString());
	}

	public void approach5(String s) {
		// string reverse with swap approach
		char[] arry = s.toCharArray();

		for (int i = 0, j = arry.length - 1; i < arry.length / 2; i++, j--) {
			char temp = arry[i];
			arry[i] = arry[j];
			arry[j] = temp;
		}

		System.out.println(Arrays.toString(arry));
		String rev = new String(arry);
		System.out.println(rev);
	}

	public void reverse(String s) {

		if (s.length() == 0) {
			return;
		}

		System.out.println(s.charAt(s.length() - 1));
		System.out.println("substring:"+s.substring(0, s.length() - 1));
		reverse(s.substring(0, s.length() - 1));

	}
	
	

}
