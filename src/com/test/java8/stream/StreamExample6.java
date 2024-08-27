package com.test.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class StreamExample6 {

	public static void main(String[] args) {
		// creating a list of Strings
		List<String> words = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			words.add("word" + i);
		}

		StreamExample6 example6 = new StreamExample6();
		System.out.println(example6.call(words));

		for (String string : words) {
			System.out.println(string);
		}

	}

	public String call(List<String> words) {

		Spliterator<String> spliterator = words.spliterator();
		int current = 0;
		while (spliterator.tryAdvance(a -> {
			a.concat("- published by Baeldung");
		})) {
			current++;
		}

		return Thread.currentThread().getName() + ":" + current;
	}

}
