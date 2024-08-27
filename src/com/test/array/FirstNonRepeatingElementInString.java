package com.test.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingElementInString {
    public static void main(String[] args) {
        String input = "swiss";

        // Find the first non-repeating character
        Character firstNonRepeatingChar = input.chars()
                .mapToObj(c -> (char) c) // Convert to Character stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Group by character and count
                .entrySet().stream() // Stream of Map entries
                .filter(entry -> entry.getValue() == 1) // Filter for non-repeating characters
                .map(Map.Entry::getKey) // Get the character
                .findFirst() // Get the first non-repeating character
                .orElse(null); // Handle if no non-repeating character exists

        // Print the result
        if (firstNonRepeatingChar != null) {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
