package com.test.java8.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTeeringExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "api");

        // Use Collectors.teeing to combine two collectors
        Map<String, Object> result = words.stream().collect(
            Collectors.teeing(
                // First collector: Summarize lengths
                Collectors.summarizingInt(String::length),
                // Second collector: Join the words
                Collectors.joining(", "),
                // Combining function: Create a map with both results
                (summaryStats, joinedWords) -> Map.of(
                    "lengthSummary", summaryStats,
                    "joinedWords", joinedWords
                )
            )
        );

        // Extract results
        System.out.println("Length Summary: " + result.get("lengthSummary"));
        System.out.println("Joined Words: " + result.get("joinedWords"));
    }
}
