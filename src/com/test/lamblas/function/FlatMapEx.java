package com.test.lamblas.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {

  public static void main(String[] args) {
    List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Geeks", "For"),
        Arrays.asList("GeeksForGeeks", "A computer portal"), Arrays.asList("Java", "Programming"));

    // Using Stream flatMap(Function mapper)
    listOfLists.stream().flatMap(list -> list.stream()).forEach(System.out::println);

    List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

    // Using Stream flatMap(Function mapper)
    list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
    
    
    
    

  }

}
