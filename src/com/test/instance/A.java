package com.test.instance;

public class A extends Base{

  private String fieldA;
  
  private  String baseField;


  public A(String fieldA,String baseField) {
    this.fieldA = fieldA;
    this.baseField = baseField;
  }

  public String getFieldA() {
    return fieldA;
  }

  public void setFieldA(String fieldA) {
    this.fieldA = fieldA;
  }
  
  @Override
  public String getBaseField() {
    return baseField;
  }

  @Override
  public void setBaseField(String baseField) {
    this.baseField = baseField;
  }
  
}
