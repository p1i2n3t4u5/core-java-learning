package com.test.completable.future2;

import java.util.concurrent.Callable;

public class Add implements Callable<Integer>{

  int a;
  int b;
  public Add(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public Integer call() throws Exception {
    System.out.println("Add Called");
    Thread.sleep(1000);
    return a + b;
  }
}
