package com.test.innerclasses;

import com.test.innerclasses.OuterClassNonstatic.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClassNonstatic outerClassNonstatic = new OuterClassNonstatic();
		InnerClass innerClass = outerClassNonstatic.new InnerClass();
		System.out.println(innerClass.b);
		innerClass.print();
		System.out.println(outerClassNonstatic.nonstatic_variable);
		System.out.println(OuterClassNonstatic.static_variable);
	}

}
