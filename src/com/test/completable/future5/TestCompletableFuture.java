package com.test.completable.future5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

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

    for (CompletableFuture<Integer> completableFuture : futures) {
      System.out.println(completableFuture.get());
    }
    
    // calculate sum 
    Integer sum = futures.stream().map(p -> {
      try {
        return p.get();
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
      return 0;
    }).collect(Collectors.summingInt(p -> p.intValue()));

    System.out.println(sum);

    // calculate sum 
    Integer sum2 = futures.stream().mapToInt(p -> {
      try {
        return p.get();
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
      return 0;
    }).sum();
    System.out.println(sum2);

  }

  public static Integer add(int a, int b) {
    return a + b;
  }

  public static Integer multiply(int result) {
    return result * 15;
  }

}
