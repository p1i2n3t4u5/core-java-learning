package com.test.lamblas7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample4 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);

		List<Integer> integers = stream.collect(Collectors.toList());
		integers.stream().forEachOrdered((p) -> System.out.println(p));
		System.out.println("-------------------------------------------------------");
		integers.stream().forEachOrdered(System.out::println);
		System.out.println("-------------------------------------------------------");
		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3, 4, 5 });
		stream2.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		// this will not work out
		Stream<int[]> stream3 = Stream.of(new int[] { 1, 2, 3, 4 });
		stream3.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		System.out.println("Sum:" + Stream.of(1, 2, 3, 4).mapToInt((p) -> p).sum());
		System.out.println("Average:" + Stream.of(1, 2, 3, 4).mapToInt((p) -> p).average());
		System.out.println("is parallel:" + Stream.of(1, 2, 3, 4).mapToInt((p) -> p).isParallel());
		System.out.println("Count:" + Stream.of(1, 2, 3, 4).mapToInt((p) -> p).count());
		System.out.println("Convert to array:" + Stream.of(1, 2, 3, 4).mapToInt((p) -> p).toArray());
		// findAny() for checking stream is empty or not
		System.out.println("Convert to array:" + Stream.of(1, 2, 3, 4).mapToInt((p) -> p).findAny().getAsInt());
		System.out.println("-------------------------------------------------------");

		int i = Stream.of(1, 2, 3, 4).mapToInt((p) -> p).reduce(0, (op1, op2) -> {
			return op1 + op2;
		});
		System.out.println("i:" + i);

		int i2 = Stream.of(1, 2, 3, 4).mapToInt((p) -> p).reduce(10, (op1, op2) -> {
			return op1 + op2;
		});
		System.out.println("i2:" + i2);
		int i3 = Stream.of(1, 2, 3, 4).mapToInt((p) -> p).reduce(1, (op1, op2) -> {
			return op1 * op2;
		});

		System.out.println("i3:" + i3);

		int i4 = Stream.of(1, 2, 3, 4).mapToInt((p) -> p).reduce(0, (op1, op2) -> {
			return op1 * op2;
		});

		System.out.println("i4:" + i4);

		System.out.println("-------------------------------------------------------");

		Stream.of(10, 20, 22, 12, 14).reduce((x, y) -> x + y).ifPresent(System.out::println);

		Stream.of(10, 20, 22, 12, 14).reduce(Integer::sum).ifPresent(System.out::println);

		Stream.of("java", "c", "c#", "python").reduce((x, y) -> x + " | " + y).ifPresent(System.out::println);

		String string = Stream.of("java", "c", "c#", "python").reduce("Hello", (x, y) -> x + " | " + y);
		System.out.println(string);
		
		int i5 = Stream.of(100,10,10).mapToInt((p) -> p).reduce(100000, (op1, op2) -> {
			System.out.println("applying reduction with identity:"+op1 / op2/2);
			return op1 / op2/2;
		});

		System.out.println("i5:" + i5);

	}

}
