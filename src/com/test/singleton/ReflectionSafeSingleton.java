package com.test.singleton;

public class ReflectionSafeSingleton {
  private static ReflectionSafeSingleton instance;

  private ReflectionSafeSingleton() {
      if (instance != null) {
          throw new IllegalStateException("Singleton instance already created");
      }
  }

  public static ReflectionSafeSingleton getInstance() {
      if (instance == null) {
          instance = new ReflectionSafeSingleton();
      }
      return instance;
  }
}

