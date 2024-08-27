package com.test.java8.optional;

import java.util.Optional;

public class OptionalOrElseExample {
  public static void main(String[] args) {
    Optional<String> optionalWithValue = Optional.of("Hello, World!");
    Optional<String> emptyOptional = Optional.empty();

    // When Optional has a value
    String result1 = optionalWithValue.orElse("Default Value");
    System.out.println(result1); // Output: Hello, World!

    // When Optional is empty
    String result2 = emptyOptional.orElse("Default Value");
    System.out.println(result2); // Output: Default Value
    
    
  }
}
