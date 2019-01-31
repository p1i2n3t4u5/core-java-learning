package com.test.classobject.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringTest4 {

	// largest common substring in two strings

	public static void main(String[] args) {
		String s1 = "jijjjijijisxdswabcdefgijijjoioijesesebcdefghijokokkkoopkoseseresabcdkokopk";
		String s2 = "jfijejjijoifjijbcdefghijokokkkojijisxdswabcdefgijijjoioijkkkoopkoseseresabcdkokopk";

		StringTest4 stringTest4 = new StringTest4();
		List<String> astrs = stringTest4.allSubStrings(s1);
		List<String> bstrs = stringTest4.allSubStrings(s2);

		Collections.sort(astrs, Collections.reverseOrder());
		Collections.sort(bstrs, Collections.reverseOrder());

		System.out.println(astrs.size());
		System.out.println(bstrs.size());

		for (String a : astrs) {

			boolean breakit = false;
			for (String b : bstrs) {

				if (a.equals(b)) {
					System.out.println(a);
					breakit = true;
					break;
				}

			}

			if (breakit) {
				break;
			}
		}

	}

	public List<String> allSubStrings(String s) {
		char[] myArray = s.toCharArray();
		List<String> strings = new ArrayList<>();

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length - i; j++) {
				List<Character> integers = new ArrayList<>();
				for (int k = 0 + i; k < myArray.length - j; k++) {
					integers.add(myArray[k]);
				}
				char[] chars = new char[integers.size()];
				int pointer = 0;
				for (Character c : integers) {
					chars[pointer] = c;
					pointer++;
				}
				// System.out.println(String.valueOf(chars));
				strings.add(String.valueOf(chars));
			}
		}

		return strings;
	}

}
