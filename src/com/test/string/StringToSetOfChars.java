package com.test.string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringToSetOfChars {

  public static void main(String[] args) {
    approach1();
    approach2();
  }

  private static void approach1() {
    String str = "hello world";

    Set<Character> charSet = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
    List<Character> charList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

    System.out.println(charSet);
    System.out.println(charList);
  }

  private static void approach2() {
    String str = "hello world";
    Set<Character> charSet = new HashSet<>();

    for (Character character : str.toCharArray()) {
      charSet.add(character);
    }
    System.out.println(charSet);
  }

}
