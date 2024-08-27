package com.test.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SubArrayWithNonDuplicateElements {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 3, 8 };

    // Find all subarrays
    List<List<Integer>> subarrays = findAllSubarrays(arr);

    // Print the result
    for (List<Integer> subarray : subarrays) {
      // System.out.println(subarray);
    }

    List<List<Integer>> listOfSet = subarrays.stream().filter(p -> new HashSet<Integer>(p).size() == p.size())
        .collect(Collectors.toList());

    System.out.println(listOfSet);
  }

  public static List<List<Integer>> findAllSubarrays(int[] arr) {
    List<List<Integer>> subarrays = new ArrayList<>();

    // Outer loop picks the starting point
    for (int start = 0; start < arr.length; start++) {
      // Inner loop picks the ending point
      for (int end = start; end < arr.length; end++) {
        // Create a sub-array from start to end
        List<Integer> subarray = new ArrayList<>();
        for (int i = start; i <= end; i++) {
          subarray.add(arr[i]);
        }
        subarrays.add(subarray);
      }
    }
    return subarrays;
  }

}
