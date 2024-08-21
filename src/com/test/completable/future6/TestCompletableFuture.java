package com.test.completable.future6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCompletableFuture {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    Random rand = new Random();
    List<CompletableFuture<Integer>> futures = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      CompletableFuture<Integer> completableFutureTask = CompletableFuture
          .supplyAsync(() -> add(rand.nextInt(100), rand.nextInt(100)), executorService)
          .thenApplyAsync(result -> multiply(result), executorService);
      futures.add(completableFutureTask);
    }

    // CompletableFuture.allOf( futures.toArray(new CompletableFuture[0])).join();

    CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new)).join();

  }

  public static Integer add(int a, int b) {
    System.out.println("add called");
    return a + b;
  }

  public static Integer multiply(int result) {
    System.out.println("multiply called");
    return result * 15;
  }

}
