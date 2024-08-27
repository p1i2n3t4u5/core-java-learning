package com.test.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinMaxFinderJava8 {
  public static void main(String[] args) {
    int[] arr = { 12, 34, 56, 1, 90, 45, -10, 67 };

    // Find the maximum element using streams
    OptionalInt max = Arrays.stream(arr).max();
    // Find the minimum element using streams
    OptionalInt min = Arrays.stream(arr).min();

    // Print the results
    max.ifPresent(value -> System.out.println("Maximum element: " + value));
    min.ifPresent(value -> System.out.println("Minimum element: " + value));

    // approach 2

    IntSummaryStatistics minMax = IntStream.of(arr).boxed()
        .collect(Collectors.teeing(Collectors.summarizingInt(Integer::intValue),
            Collectors.summarizingInt(Integer::intValue), (left, right) -> left // Both collectors are the
                                                                                // same, so return one
        ));

    // Print the results
    System.out.println("Maximum element: " + minMax.getMax());
    System.out.println("Minimum element: " + minMax.getMin());

    // approach3

    MinMax minMax2 = IntStream.of(arr).boxed()
        .collect(Collectors.teeing(Collectors.maxBy(Comparator.comparingInt(p -> p)),
            Collectors.minBy(Comparator.comparingInt(p -> p)), (a, b) -> new MinMax(a.orElse(0), b.orElse(0))));

    System.out.println(minMax2);

    IntSummaryStatistics s = IntStream.of(arr).boxed().collect(Collectors.summarizingInt(Integer::intValue));

    System.out.println(s);

  }

  static class MinMax {
    int min;
    int max;

    MinMax(int min, int max) {
      this.min = min;
      this.max = max;
    }

    @Override
    public String toString() {
      return "MinMax [min=" + min + ", max=" + max + "]";
    }

  }
}
