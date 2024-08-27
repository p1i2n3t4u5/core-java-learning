package com.test.array;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringInArray {

  public static void main(String[] args) {
    List<String> strings = List.of("apple", "banana", "apple", "orange", "banana", "apple");

    // Find duplicate elements and their occurrences
    Map<String, Long> duplicates = strings.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
        .entrySet().stream().filter(entry -> entry.getValue() > 1) // Filter only duplicates
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    // Print the duplicate elements and their occurrences
    duplicates.forEach((element, count) -> System.out.println(element + " occurs " + count + " times"));
  }

}
