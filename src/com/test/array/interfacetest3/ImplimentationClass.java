package com.test.array.interfacetest3;

public class ImplimentationClass implements Interface1, Interface2 {

  @Override
  public void write() {

  }

  public static void read() {
    System.out.println("read in ImplimentationClass");
  }

  @Override
  public void print() {
    System.out.println("print in ImplimentationClass ");
    
    Interface1.super.print();
    Interface2.super.print();
  }
  
  
//  @Override
//  public void print() {
//    // TODO Auto-generated method stub
//    Interface2.super.print();
//  }
//  
//  
//  @Override
//  public void print() {
//    // TODO Auto-generated method stub
//    Interface1.super.print();
//  }

}
