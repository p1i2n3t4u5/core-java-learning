package com.test.lamblas.function;

import java.util.function.Consumer;

public class ConsumerTest {
  
  public static void main(String[] args) {
    
    Consumer<String>  consumer = (a) -> System.out.println(a);
    consumer.accept("Hello");
    
    Consumer<String>  consumer2 = System.out::println;
    consumer2.accept("HI");
  }

}
