package com.test.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Partition the numbers into even and odd
    Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(num -> num % 2 == 0));

    // Print the result
    System.out.println("Even numbers: " + partitioned.get(true));
    System.out.println("Odd numbers: " + partitioned.get(false));
}
}
