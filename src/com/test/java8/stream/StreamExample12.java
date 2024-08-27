package com.test.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample12 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

    // Stream the list and collect the results into a LinkedHashMap
    LinkedHashMap<String, Integer> resultMap = list.stream().collect(Collectors.toMap(
        // Key mapper - the string itself
        str -> str,
        // Value mapper - the length of the string
        str -> str.length(),
        // Merge function in case of duplicate keys (not needed here)
        (existing, replacement) -> existing,
        // Supplier to use LinkedHashMap as the output map
        LinkedHashMap::new));

    // Print the resulting LinkedHashMap
    resultMap.forEach((key, value) -> System.out.println(key + " -> " + value));
  }

}
