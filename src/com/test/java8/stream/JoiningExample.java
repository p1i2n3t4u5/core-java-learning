package com.test.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
  public static void main(String[] args) {
      List<String> words = Arrays.asList("hello", "world", "java", "streams");

      // Joining the elements into a single string with a delimiter
      String result = words.stream()
          .collect(Collectors.joining(", "));

      // Print the result
      System.out.println("Joined String: " + result);
  }
}