package com.test.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("com.test.reflection.Student");

		Method method = c.getDeclaredMethod("display", String.class);
		method.setAccessible(true);
		// as it is a static method no need to pass object to call this method upon
		method.invoke(null, "Niranjan");
	}

}
