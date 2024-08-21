package com.test.completable.future2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceProblem1 {

  public static void main(String[] args) {
    try {
      ExecutorService executor = Executors.newFixedThreadPool(3);
      Future<Integer> future = executor.submit(new Add(5, 3));
      Integer sum = 0;
      sum = future.get();
      Future<Integer> future2 = executor.submit(new Multiply(sum));
      System.out.println(future2.get());
      executor.shutdown();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }

}
