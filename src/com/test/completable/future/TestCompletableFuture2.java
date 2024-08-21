package com.test.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture2 {

  public static void main(String[] args) {
    CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(6000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "Hello";
    });
    CompletableFuture<String> greetingFuture = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "World";
    });

    CompletableFuture<String> combinedFuture = helloFuture.thenCombine(greetingFuture, (m1, m2) -> m1 + " " + m2);

    System.out.println("Next Line");
    try {
      System.out.println(combinedFuture.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    System.out.println("End");
  }

}
