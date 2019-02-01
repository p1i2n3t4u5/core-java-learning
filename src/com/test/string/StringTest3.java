package com.test.string;

import java.util.Arrays;

public class StringTest3 {

	public static void main(String[] args) {
		StringTest3 stringTest3 = new StringTest3();
		stringTest3.approach2();
	}

	public void approach1() {
		String s = "  aaa bb ccc ddd  e ";
		System.out.println(s.trim().split(" ").length);

		String[] ss = s.trim().split(" ");
		System.out.println(Arrays.toString(ss));

		int count = 0;
		for (String sss : ss) {
			if (!sss.trim().equals("")) {
				count++;
			}
		}

		System.out.println("count:" + count);
	}

	public void approach2() {
		String s = "  aaa bb ccc ddd  e ";
		
		char ch[] = new char[s.length()]; // in string especially we have to mention the () after length
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				c++;
		}
		System.out.println(c);
	}

}
