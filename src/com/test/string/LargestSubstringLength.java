package com.test.string;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class LargestSubstringLength {

  public static void main(String[] args) {
    String s = "abcdazbkspd";
    Map<String, Integer> map = new HashMap<>();
    Set<String> set = new HashSet<>();

    for (int i = 0; i < s.toCharArray().length; i++) {
      for (int j = i + 1; j < s.toCharArray().length; j++) {
        String sub = s.substring(i, j);
        int sublength = sub.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size();
        set.add(sub);
        if (sub.length() == sublength) {
          map.put(sub, sublength);
        }
      }
    }

    LinkedHashMap<String, Integer> newMap = new LinkedHashMap<>();

    map.entrySet().stream().sorted(Comparator.comparingInt(p -> ((Entry<String, Integer>) p).getValue()).reversed())
        .forEachOrdered(p -> {
          newMap.put(p.getKey(), p.getValue());
        });
    System.out.println(newMap);
  }

}
