package com.test.completable.future2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceProblem2 {

  public static void main(String[] args) {
    try {
      Random rand = new Random();
      //Problem here is both add and multiply can not be executed async manner
      ExecutorService executor = Executors.newFixedThreadPool(3);
      List<Future<Integer>> finalFutureList = new ArrayList<>();
      List<Integer> finalResultList = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
        Future<Integer> futureResult = executor.submit(new Add(rand.nextInt(), rand.nextInt())); // 1
        Integer intermediateResult = futureResult.get(); // 2
        Future<Integer> finalResult = executor.submit(new Multiply(intermediateResult));
        finalFutureList.add(finalResult);
      }
      for (Future<Integer> future : finalFutureList) {
        finalResultList.add(future.get());
        System.out.println("Future Completed");
      }
      //System.out.println(finalFutureList);
      executor.shutdown();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }

}
