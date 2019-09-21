package com.test.lamblas7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysToStream {
	public static void main(String[] args) {
		// Creating an integer array
		int arr[] = { 1, 6, 6, 11, 5, 9, 4 };
		// Using Arrays.stream() to convert
		// array into Stream
		IntStream stream = Arrays.stream(arr);

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));

		System.out.println("Count:" + Arrays.stream(arr).count());

		if (Arrays.stream(arr).average().isPresent()) {
			System.out.println("Average:" + Arrays.stream(arr).average().getAsDouble());
		}

		System.out.println("is There any elemet is divisible by 2 :" + Arrays.stream(arr).anyMatch((a) -> a % 2 == 0));

		System.out.println("distinct count of all elements divisible by 2   :"
				+ Arrays.stream(arr).distinct().filter((a) -> a % 2 == 0).count());

		System.out.println("printing the elemets divisible by 2 after filtering duplicate:"
				+ Arrays.toString(Arrays.stream(arr).distinct().filter((a) -> a % 2 == 0).toArray()));
		
	}
}
