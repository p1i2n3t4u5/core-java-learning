package com.test.array;

public class ArrayTest1 {
	
	//find the missing number 
	
	public static void main(String[] args) {
		
		String[] s= new String[10];
		String[]  ss= {"sss","ssd"};
		
		Integer[] arr= {1,2,3,4,6,7,8};
		
		Integer sum =0;
		for (Integer integer : arr) {
			sum+=integer;
		}
		System.out.println(sum);
		
		
		Integer actualsum=(9*8)/2;  //(n*(n+1))/2
		
		Integer missing=actualsum-sum;
		System.out.println(missing);
		
		
	}

}
