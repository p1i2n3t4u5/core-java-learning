package com.test.java8.stream;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    // Using peek to debug and print each element
    List<Integer> result = numbers.stream().peek(num -> System.out.println("Original number: " + num))
        .map(num -> num * 2) // Doubling each number
        .peek(num -> System.out.println("Doubled number: " + num)).filter(num -> num > 5) // Filtering out
                                                                                          // numbers less than
                                                                                          // or equal to 5
        .peek(num -> System.out.println("Filtered number: " + num)).toList(); // Collecting the result into a
                                                                              // list

    // Print the final result
    System.out.println("Final result: " + result);
  }
}
