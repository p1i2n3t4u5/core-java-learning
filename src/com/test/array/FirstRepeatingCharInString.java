package com.test.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstRepeatingCharInString {
  public static void main(String[] args) {
    String input = "swiss";

    Optional<Character> firstRepeating = input.chars() // Stream of int representing characters
        .mapToObj(c -> (char) c) // Convert int to Character
        .collect(Collectors.toMap(c -> c, // Key: the character itself
            c -> 1, // Value: occurrence count
            Integer::sum, // Merge function to handle multiple occurrences
            LinkedHashMap::new)) // Use LinkedHashMap to preserve the order of insertion
        .entrySet().stream() // Stream the map entries
        .filter(e -> e.getValue() > 1) // Filter entries where the value (count) is greater than 1
        .map(Map.Entry::getKey) // Get the key (character)
        .findFirst(); // Find the first match

    // Print the result
    firstRepeating.ifPresentOrElse(ch -> System.out.println("First repeating character: " + ch),
        () -> System.out.println("No repeating characters found"));
  }

}
