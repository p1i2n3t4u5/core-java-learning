package com.test.instance;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

  public static void main(String[] args) {
    
    List<Base> pppList = new ArrayList<>();
    pppList.add(new A("aaaa", "base"));
    printType(pppList);
  }

  private static void printType(List<? extends Base> ppp) {
  
    ppp.forEach(p -> {
      
      if(p instanceof A) {
        System.out.println("A "+((A)p).getFieldA()+"  "+p.getBaseField());
      }
      
      if(p instanceof B) {
        System.out.println("B "+((B)p).getFieldB()+"  "+p.getBaseField());
      }
      
    });
    
  }
  
}
