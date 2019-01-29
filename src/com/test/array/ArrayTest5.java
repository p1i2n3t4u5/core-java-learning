package com.test.array;

import java.util.Arrays;

public class ArrayTest5 {

	// arr[sc.nextInt()%k]++; initialize the counter of remainders present
	//
	// for example if k=5 then for any inpyt, er can have 0,1,2,3,4 as remainder
	//
	// This is like a lookup table saying : in the set of numbers you have , there
	// are x counts of numbers which give remainder 0 when divided by k,y counts of
	// numbers which give remainder 1 when divided by k,.. and so on.
	//
	// Now, taking our earlier example of k=5, Number with remainder 1 cant be
	// paired with number with remainder 4,Number with remainder 2 cant be paired
	// with number with remainder 3,Number with remainder 0 cant be paired with
	// number with remainder 0, Since paring them will result in a number divisible
	// by 5. This, take the remainder count with maximum numbers :
	//
	// for(int j=1;j<=k/2;j++) if(j!=k-j)result+=Math.max(arr[j],arr[k-j]);
	//
	// Also, if k is multiple of 2 then we add those numbers lying in the middle,
	// once if(k%2==0)result++;
	//
	// LAstly, result=result+Math.min(arr[0],1);//If no number wholly divisible dont
	// add it to pair else add once

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		// Scanner sc = new Scanner(System.in);
		int n = 10; // length of array
		int k = 5; // number divisible
		int[] arr = new int[k];

		// original array
		// int [] oriArray =new int[n];
		// Random random=new Random();
		// for(int i=0;i<n;i++){
		// oriArray[i]=random.nextInt(50);
		// }
		// System.out.println("oriArray:"+Arrays.toString(oriArray));

		int[] oriArray = { 30, 34, 5, 25, 5, 31, 26, 0, 30, 30 };

		for (int i = 0; i < n; i++) {
			arr[oriArray[i] % k]++;
		}
		System.out.println("arr:" + Arrays.toString(arr));
		int result = 0;
		if (k % 2 == 0) {
			result++; // it will not have any conjugate pair
		}
		result = result + Math.min(arr[0], 1);// If no number wholly divisible dont add it to pair else add once
		for (int j = 1; j <= k / 2; j++) {
			if (j != k - j) {
				result += Math.max(arr[j], arr[k - j]);
			}
		}
		System.out.println(result);
	}
}
