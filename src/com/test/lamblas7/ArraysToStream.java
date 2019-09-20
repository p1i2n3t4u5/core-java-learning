package com.test.lamblas7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysToStream {
	public static void main(String[] args) {
		// Creating an integer array
		int arr[] = { 1, 2, 3, 4, 5 };
		// Using Arrays.stream() to convert
		// array into Stream
		IntStream stream = Arrays.stream(arr);

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));

		System.out.println("Count:" + Arrays.stream(arr).count());

		if (Arrays.stream(arr).average().isPresent()) {
			System.out.println("Average:" + Arrays.stream(arr).average().getAsDouble());
		}

	}
}
