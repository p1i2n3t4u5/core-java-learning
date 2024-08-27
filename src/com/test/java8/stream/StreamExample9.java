package com.test.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample9 {
  
  public static void main(String[] args) {
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    int result = numbers
      .stream()
      .reduce(0, (subtotal, element) -> subtotal + element);
    
    int result2 = numbers.stream().reduce(0, Integer::sum);
    
    System.out.println(result);
    System.out.println(result2);
   // ----------------------------------------------------------
    
    List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
    String result3 = letters
      .stream()
      .reduce("", (partialString, element) -> partialString + element);
    
    String result4 = letters.stream().reduce("", String::concat);
    
    System.out.println(result3);
    System.out.println(result4);
    
 // ----------------------------------------------------------
    
    String result5 = letters
        .stream()
        .reduce(
          "", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
    System.out.println(result5);
    
    List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
    int result6 = ages.parallelStream().reduce(0, Integer::sum, Integer::min);
    System.out.println(result6);
  //---------------------------------------------------------------
    
    
    
    
  }

}
