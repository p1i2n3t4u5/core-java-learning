package com.test.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample10 {

  // second highest repeating number with stream

  public static void main(String[] args) {
    int[] arr = { 5, 5, 5, 5, 7, 7, 7, 3, 3, 1, 2, 9 };
    
    char[] chars = { 'a','a','b','b'};

    // approach1
    Map<Object, Long> map = Arrays.stream(arr).mapToObj(Integer::valueOf)
        .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Object, Long>::getValue).reversed()).skip(1).limit(1)
        .forEach(System.out::print);

    // approach2
    Map<Integer, Long> map2 = Arrays.stream(arr).boxed() // Convert int to Integer
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Object, Long>::getValue).reversed()).skip(1).limit(1)
        .forEach(System.out::print);
    
    //approach3
    
    Map<String, Long> map3 = Arrays.stream(arr)
        .mapToObj(Integer::toString) // Convert each integer to its string representation
        .collect(Collectors.groupingBy(s -> s, Collectors.counting())); // Group by the string and count occurrences

    Map<Integer, Long> map4 = Arrays.stream(arr)
        .mapToObj(Integer::valueOf) // Convert each integer to its string representation
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    

    // wrong approach
//    .mapToObj(Integer::valueOf)
//    .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

  }

}
