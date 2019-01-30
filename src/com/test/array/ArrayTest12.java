package com.test.array;

public class ArrayTest12 {
	
	// Java program to find first non-repeating  
	// element. 

	public static void main(String[] args) {
		  //int arr[] = { 9, 4, 9, 6, 7, 4 }; 
		 int arr[]= {-1 ,2 ,-1 ,3 ,2};
	      ArrayTest12 arrayTest12=new ArrayTest12();     
	      arrayTest12.firstNonRepeatingElement(arr);
	}
	
	
	public void firstNonRepeatingElement(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			int repeatIndex=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j] && i!=j) {
					repeatIndex=j;
					break;
				}
			}
			System.out.println("Index:"+repeatIndex);
			System.out.println("First Repeating:"+arr[repeatIndex]);
			
			if (repeatIndex < arr.length-1) {
				System.out.println("first Not repeating : "+arr[repeatIndex+1]);
				break;
			}
			
		}
		
	}

}
