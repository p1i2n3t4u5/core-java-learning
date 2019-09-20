package com.test.innerclasses;

import com.test.innerclasses.OuterClassStatic.InnerClass;

public class MainClass2 {
	public static void main(String[] args) {
		OuterClassStatic outerClassStatic = new OuterClassStatic();

		InnerClass innerClass = new OuterClassStatic.InnerClass();
		System.out.println(innerClass.b);
		innerClass.print();
	}

}
