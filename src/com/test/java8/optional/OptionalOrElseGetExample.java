package com.test.java8.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseGetExample {
  public static void main(String[] args) {
    Optional<String> optionalWithValue = Optional.of("Hello, World!");
    Optional<String> emptyOptional = Optional.empty();

    // Supplier to provide the default value
    Supplier<String> defaultValueSupplier = () -> {
      // Simulating expensive computation
      System.out.println("Computing default value...");
      return "Computed Default Value";
    };

    // When Optional has a value
    String result1 = optionalWithValue.orElseGet(defaultValueSupplier);
    System.out.println(result1); // Output: Hello, World!

    // When Optional is empty
    String result2 = emptyOptional.orElseGet(defaultValueSupplier);
    System.out.println(result2); // Output: Computing default value...
                                 // Computed Default Value
  }
}
