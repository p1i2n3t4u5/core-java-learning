package com.test.completable.future4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCompletableFuture {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    
   // Executing CompletableFuture  task with threads form existing pool
    Integer finalResult = CompletableFuture.supplyAsync(() -> add(10, 20), executorService)
        .thenApplyAsync(result -> multiply(result), executorService).get();
    System.out.println(finalResult);
  }

  public static Integer add(int a, int b) {
    return a + b;
  }

  public static Integer multiply(int result) {
    return result * 15;
  }

}
