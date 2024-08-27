package com.test.java8.stream;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample13 {
  
  public static void main(String[] args) {
    String s="aaaaabbbbccccdddd";
    
    Map<Character,Long> map =  s.chars().mapToObj(p -> (char)p).collect(Collectors.groupingBy(p ->p,Collectors.counting()));
    
    System.out.println(map);
    
    Set<Character> set =  s.chars().mapToObj(p -> (char)p).collect(Collectors.toSet());
    
    System.out.println(set);
  }

}
