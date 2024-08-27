package com.test.array;

public class CheckArrayIsSorted {
  
  public static void main(String[] args) {
    
    //int[] array = {1, 2, 3, 4, 5};
    int[] array = {5, 4, 3, 2, 1};
    
    boolean sortedDesc = true;
    boolean sortedAsc = true;
    for (int i = 1; i < array.length; i++) {
      
      if(array[i-1] > array[i]) {
        sortedAsc = false;
      }
      
      if(array[i-1] < array[i]) {
        sortedDesc = false;
      }
      
    }
    System.out.println("sortedDesc:"+sortedDesc+"  sortedAsc:"+sortedAsc);
  }

}
