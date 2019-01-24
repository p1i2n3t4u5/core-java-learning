package com.test.classobject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaClassObject {
	 public static void main(String[] args) 
	    { 
	        Student s1 = new Student(); 
	  
	        // Getting hold of Class object created 
	        // by JVM. 
	        Class c1 = s1.getClass(); 
	  
	        // Printing type of object using c1. 
	        System.out.println(c1.getName()); 
	  
	        // getting all methods in an array 
	        Method m[] = c1.getDeclaredMethods(); 
	        for (Method method : m) {
	           
	            try {
	            	 System.out.println(method.getName()); 
	            	if (method.getName().startsWith("setName")) {
	            		method.invoke(s1, "hello");
					}
	            	
	            	if (method.getName().startsWith("setRoll_no")) {
	            		method.invoke(s1, 11);
					}
					
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        // getting all fields in an array 
	        Field f[] = c1.getDeclaredFields(); 
	        for (Field field : f) 
	            System.out.println(field.getName()); 
	    } 
}
