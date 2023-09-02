package com.test.instance;

public class B extends Base{
   private String fieldB;

   private  String baseField;

  public B(String fieldB,String baseField) {
    this.fieldB = fieldB;
    this.baseField = baseField;
  }

  public void setFieldB(String fieldB) {
    this.fieldB = fieldB;
  }

  public String getFieldB() {
    return fieldB;
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
