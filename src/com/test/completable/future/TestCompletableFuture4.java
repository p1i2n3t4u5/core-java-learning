package com.test.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture4 {

  public static void main(String[] args) {
    CompletableFuture<Void> greetingFuture = CompletableFuture.runAsync(new Run());
    try {
      greetingFuture.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }

  static class Run implements Runnable {
    @Override
    public void run() {
      System.out.println("Hiiiiii");
    }
  }

}
