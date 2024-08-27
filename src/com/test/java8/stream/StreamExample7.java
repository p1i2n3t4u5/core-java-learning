package com.test.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample7 {

	public static void main(String[] args) {
		Stream<List<String>> namesOriginalList = Stream.of(Arrays.asList("Pankaj","Devdas"), Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
		// flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());

		flatStream.forEach(System.out::println);

		System.out.println("--------------------filtering based starting with D---------------------");
		
		Stream<List<String>> namesOriginalList2 = Stream.of(Arrays.asList("Pankaj","Devdas"), Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
		namesOriginalList2.flatMap(strList -> strList.stream()).filter((s) -> {
			return s.startsWith("D");
		}).forEach(System.out::println);
		
	}

}
