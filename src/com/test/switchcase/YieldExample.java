package com.test.switchcase;

public class YieldExample {

  public static void main(String[] args) {

    int key = 1;
    String value = switch (key) {
    case 1: {
      yield "ONE";
    }
    case 2: {
      yield "TWO";
    }
    default: {
      yield "ZERO";
    }
    };
    System.out.println(value);

    
    // with arrow 
    
    Number key2 = Number.TWO;
    String message = switch (key2) {
    case ONE -> {
      yield "Got a 1";
    }
    case TWO -> {
      yield "Got a 2";
    }
    case THREE,FOUR -> {
      yield "Got a 3 Or 4";
    }
    default -> {
      yield "More than 4";
    }
    };

    System.out.println(message);

  }

}
