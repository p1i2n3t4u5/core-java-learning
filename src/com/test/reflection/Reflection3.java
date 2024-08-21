package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection3 {

	public static void main(String[] args)  {

		// calling constructor with sing String argument
		Class<?> c=null;
		Student student=null;
		try {
			c = Class.forName("com.test.reflection.Student");
			Constructor<?> constructor = c.getDeclaredConstructor(String.class);
			constructor.setAccessible(true);
			student = (Student) constructor.newInstance("Hello");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		System.err.println(student);

		@SuppressWarnings("unchecked")
		Constructor<Student> constructor2=null;
		try {
			constructor2 = (Constructor<Student>) c.getConstructor(String.class, int.class);
		} catch (NoSuchMethodException | SecurityException e1) {
			e1.printStackTrace();
		}
		Student student2=null;
		try {
			student2 = constructor2.newInstance("hello", 12);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(student2);

	}

}
