package com.test.lamblas.function;

import java.util.function.BiFunction;

public class BifunTest {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> biFun = (a, b) -> a + b;
    Integer result = biFun.apply(10, 20);
    System.out.println(result);
  }

}
