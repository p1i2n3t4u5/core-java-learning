package com.test.lamblas4;

import java.util.function.BiConsumer;

public class MainClassJava8_3 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5 };
		int key = 0;
		//process(arr, key,(i,k)->System.out.println(i / k));
		
		process(arr, key,wrapper((i,k)->System.out.println(i / k)));
	}

	private static void process(int[] arr, int key,BiConsumer<Integer,Integer> consumer) {
		for (int i : arr) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer,Integer>  wrapper(BiConsumer<Integer,Integer> consumer) {
		return (v,k)->{
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception occured");
			}
		};
	}
	
	

}
