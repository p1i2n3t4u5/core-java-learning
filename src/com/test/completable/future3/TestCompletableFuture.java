package com.test.completable.future3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    Integer finalResult = CompletableFuture.supplyAsync(() -> add(10, 20)).thenApplyAsync(result -> multiply(result))
        .get();
    System.out.println(finalResult);
  }

  public static Integer add(int a, int b) {
    return a + b;
  }
  public static Integer multiply(int result) {
    return result * 15;
  }

}
