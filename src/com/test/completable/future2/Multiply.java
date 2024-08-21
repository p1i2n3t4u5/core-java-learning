package com.test.completable.future2;

import java.util.concurrent.Callable;

public class Multiply implements Callable<Integer>{
  int result;
  public Multiply(int result) {
    this.result = result;
  }

  @Override
  public Integer call() throws Exception {
    Thread.sleep(1000);
    return result*10;
  }
}
