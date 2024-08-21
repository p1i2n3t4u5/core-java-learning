package com.test.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture {

  public static void main(String[] args) {
    CompletableFuture<String> greetingFuture = CompletableFuture.supplyAsync(() -> {
      // some async computation
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "Hello from CompletableFuture";
    });
    greetingFuture.join();  // will wait till the future operation finishes
    System.out.println("Next Line");
    try {
      System.out.println(greetingFuture.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    System.out.println("End");
    
    
    CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Hello");
    
    try {
      System.out.println(completableFuture.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    
  }

}
