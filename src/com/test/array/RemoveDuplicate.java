package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
  
  
  
  public static void main(String[] args) {
//    removeDuplicatesBySet();
//    removeDuplicatesByArrayApproch();
//    removeDuplicatesFromSortedArray();
      removeDuplicateByJava8();
    
  }

  private static void removeDuplicateByJava8() {
    Integer[] arr = { 10, 20, 40, 20, 30, 10 };
    Integer[] finalArr = Arrays.stream(arr).distinct().toArray(Integer[]::new);
    Integer[] finalArr2 = Arrays.stream(arr).distinct().toArray(a -> new Integer[arr.length]);
    
    for (int i = 0; i < finalArr.length; i++) {
      System.out.println(finalArr[i]);
    }
    
    for (int i = 0; i < finalArr2.length; i++) {
      System.out.println(finalArr2[i]);
    }
  }

  private static void removeDuplicatesFromSortedArray() {
    
    // with two pointer approach
    Integer[] arr = {10,20,40,20,30,10};
    Arrays.sort(arr); // {10,10,20,20,30,40};
    Integer[] finalArr = new Integer[arr.length];
    int pointer1 = 0;
    int pointer2 = 1;
    finalArr[0] = arr[0];
    int counter = 1;
    while(pointer1+1 < arr.length) {
      if(arr[pointer1] == arr[pointer2]) {
        pointer2 ++;
      }else {
        pointer1 = pointer2;
        pointer2++;
        finalArr[counter] = arr[pointer1]; 
        counter++;
      }
    }
    for (int i = 0; i < finalArr.length; i++) {
      System.out.println(finalArr[i]);
    }
    
  }

  private static void removeDuplicatesByArrayApproch() {
    Integer[] arr = {10,20,40,20,30,10};
    Integer[] finalArr = new Integer[arr.length];
    List<Integer> duplicateIndexes = new ArrayList<>(); 
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if((i!=j && arr[i] == arr[j])) {
          duplicateIndexes.add(j);
        }
      }
    }
    System.out.println(duplicateIndexes);
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if(!duplicateIndexes.contains(i)) {
        finalArr[counter] = arr[i];
        counter++;
      }
    }
    for (int i = 0; i < finalArr.length; i++) {
      System.out.println(finalArr[i]);
    }
  }

  private static void removeDuplicatesBySet() {
    Integer[] arr = {10,20,40,20,30,10};
    Set<Integer> set = new HashSet<Integer>();
    set.addAll(Arrays.asList(arr));
    System.out.println(set);
  }

}
