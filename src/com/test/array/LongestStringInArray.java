package com.test.array;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestStringInArray {

  public static void main(String[] args) {

    List<String> strings = List.of("apple", "banana", "cat", "dog", "pineapple", "guava");
    Optional<Map.Entry<String, Integer>> firstLongestString = strings.stream()
        .collect(Collectors.toMap(p -> p, p -> p.length())) // Create a map of strings and their lengths
        .entrySet().stream() // Stream the map entries
        .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()) // Sort by value (length) in
                                                                           // descending order
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, // In case of a tie
                                                                                          // (not needed here,
                                                                                          // but required by
                                                                                          // toMap)
            LinkedHashMap::new // Use LinkedHashMap to preserve the order of sorted entries
        )).entrySet().stream().findFirst();

    // Print the sorted map
    if(firstLongestString.isPresent()) {
      System.out.println(firstLongestString.get());
    }
  }

}
