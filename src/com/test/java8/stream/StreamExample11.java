package com.test.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample11 {

  public static void main(String[] args) {

    // array to stream

    int[] intArray = { 1, 2, 3, 4 };
    IntStream intStream = Arrays.stream(intArray);

    String[] strArray = { "a", "b", "c" };
    Stream<String> strStream = Arrays.stream(strArray);

    // stream to array

    Stream<String> strStream2 = Stream.of("a", "b", "c");
    String[] strArray2 = strStream.toArray(String[]::new);

    IntStream intStream2 = IntStream.of(1, 2, 3, 4);
    int[] intArray2 = intStream.toArray();

    // map operation
    int[] doubledArray3 = Arrays.stream(intArray).map(i -> i * 2).toArray();

    // filter operation

    int[] evenArray = Arrays.stream(intArray).filter(i -> i % 2 == 0).toArray();

    // sort using Stream

    int[] sortedArray = Arrays.stream(intArray).sorted().toArray();

    // reduction or aggregation

    int sum = Arrays.stream(intArray).reduce(0, (a, b) -> a + b);

    double average = Arrays.stream(intArray).average().orElse(0);

    // multi-dimentional array to stream

    int[][] array2D = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
    int[] flatArray = Arrays.stream(array2D).flatMapToInt(Arrays::stream).toArray();

    // parallel processing
    int sum2 = Arrays.stream(intArray).parallel().reduce(0, (a, b) -> a + b);

    // remove null element
    String[] strings = { "a", null, "b" };
    String[] nonNullStrings = Arrays.stream(strings).filter(Objects::nonNull).toArray(String[]::new);

    List<String> list = Arrays.stream(new String[] { "a", "b", "c" }).collect(Collectors.toList());

    Set<String> set = Arrays.stream(new String[] { "a", "b", "c" }).collect(Collectors.toSet());

  }

}
