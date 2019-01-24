package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// calling constructor with sing String argument
		Class<?> c = Class.forName("com.javatest.reflection.Student");
		Constructor<?> constructor = c.getConstructor(String.class);
		Student student = (Student) constructor.newInstance("Hello");
		System.err.println(student);

		@SuppressWarnings("unchecked")
		Constructor<Student> constructor2 = (Constructor<Student>) c.getConstructor(String.class, int.class);
		Student student2 = constructor2.newInstance("hello", 12);
		System.out.println(student2);

	}

}
