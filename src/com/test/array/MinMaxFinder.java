package com.test.array;

public class MinMaxFinder {
  public static void findMinMax(int[] arr) {
      // Ensure the array is not empty
      if (arr == null || arr.length == 0) {
          System.out.println("Array is empty!");
          return;
      }

      // Initialize max and min with the first element
      int max = arr[0];
      int min = arr[0];

      // Traverse the array
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
              max = arr[i];  // Update max if current element is greater
          }
          if (arr[i] < min) {
              min = arr[i];  // Update min if current element is smaller
          }
      }

      // Print the results
      System.out.println("Maximum element: " + max);
      System.out.println("Minimum element: " + min);
  }

  public static void main(String[] args) {
      int[] arr = {12, 34, 56, 1, 90, 45, -10, 67};
      findMinMax(arr);
  }
}

