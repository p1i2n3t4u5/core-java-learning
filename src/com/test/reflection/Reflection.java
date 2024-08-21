package com.test.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Student student=new Student();
		Method method = null;

		// try {
		// method= student.getClass().getMethod("setName", String.class);
		// } catch (NoSuchMethodException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (SecurityException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// try {
		// method = Student.class.getMethod("setName", String.class);
		// } catch (NoSuchMethodException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// } catch (SecurityException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		Class<?> c = Class.forName("com.test.reflection.Student");
		method = c.getMethod("setName", String.class);

		Student student2 = new Student();
		try {
			method.invoke(student2, "xyz");
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

		// System.out.println(student);
		System.out.println(student2);

	}

}
