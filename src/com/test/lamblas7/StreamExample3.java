package com.test.lamblas7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 4, 5, 30, 50, 80);

		// System.out.println(numbers.stream().filter(n -> n > 10).findFirst().get());

		numbers.stream().filter(n -> n > 10).skip(0).forEach(p -> System.out.println(p));

		int sum = numbers.stream().filter(n -> n > 10).mapToInt(i -> i * 2 / 2).sum();
		System.out.println("sum:" + sum);

		List<Integer> collected = numbers.stream().filter(n -> n > 10).mapToInt(i -> {
			return i * 2 / 2;
		}).boxed().collect(Collectors.toList());

		System.out.println(Arrays.toString(collected.toArray()));

		boolean b = numbers.stream().filter(n -> n >= 10).mapToInt(i -> {
			return i * 2 / 2;
		}).anyMatch(p -> p == 10);

		System.out.println("Ten exist:" + b);

	}

}
