package com.test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection2 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Student student=new Student();
		
		Class<?> c = Class.forName("com.test.reflection.Student");
		Field field= c.getDeclaredField("name");
		System.out.println(field.getModifiers());
		System.out.println(field.isAccessible());
		field.setAccessible(true);
		System.out.println(field.isAccessible());
		
		try {
			field.set(student, "xyz");
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(student);
		
		
		
		Method method=null;
		try {
			method=c.getDeclaredMethod("print");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		method.setAccessible(true);
		
		
		try {
			method.invoke(student);
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

}
