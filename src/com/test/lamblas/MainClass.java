package com.test.lamblas;

public class MainClass {

  public static void main(String[] args) {

    Greeting greeting = new GreetingImpl();
    greeting.greet();

    Greeting greeting2 = () -> System.out.println("Hello World From Lambda");
    greeting2.greet();

    // difference between above two is in first approach we are creating an implementation class
    // in second approach we are just the function

    // one approach to create an implementation of an interface in-line using anonymous inner-class
    Greeting greeting3 = new Greeting() {

      @Override
      public void greet() {
        System.out.println("Hello World From Anonymous inner class");
      }
    };
    greeting3.greet();

    // lambda are not same as creating an anonymous inner class implementation. This is a different approach

    MyLambda lambda = () -> System.out.println("Hello World");
    // lambda's type checking is done through functional interface
    lambda.foo();

    MyLambda2 lambda2 = (int a, int b) -> {
      return a + b;
    };
    System.out.println(lambda2.foo(10, 20));
  }
}

interface MyLambda {
  void foo();
}

interface MyLambda2 {
  int foo(int a, int b);
}
