package com.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

  static int result = 0;

  public static void main(String[] args) {

    int b = 1;
    int a = 1;
    CountDownLatch countDownLatch = new CountDownLatch(2);

    Thread t1 = new Thread(new Runnable() {

      @Override
      public void run() {
        result += a + b;
        sleep();
        countDownLatch.countDown();
      }
    });
    Thread t2 = new Thread(new Runnable() {

      @Override
      public void run() {
        result += a + b;
        sleep();
        countDownLatch.countDown();
      }
    });
    t1.start();
    t2.start();

    try {
      countDownLatch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(result);

  }

  public static void sleep() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
