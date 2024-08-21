package com.test.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture3 {

  public static void main(String[] args) {
    CompletableFuture<Integer> resultFuture 
    // java.lang.ArithmeticException: / by zero 
      = CompletableFuture.supplyAsync(() -> 10 / 0)   
                .exceptionally(ex -> 100); 
  
    // 0 - returned by exceptionally block 
  try {
    System.out.println(resultFuture.get());
  } catch (InterruptedException | ExecutionException e) {
    e.printStackTrace();
  } 
  }

}
