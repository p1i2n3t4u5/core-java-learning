package com.test.array;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUniqueElementsInString {

  public static void main(String[] args) {

    String input = "swiss";
    List<Character> list = input.chars().mapToObj(p -> (char) p)
        .collect(Collectors.groupingBy(p -> p, Collectors.counting())).entrySet().stream()
        .filter(e -> e.getValue() == 1).map(Map.Entry<Character, Long>::getKey).toList();
    
    System.out.println(list);

  }

}
