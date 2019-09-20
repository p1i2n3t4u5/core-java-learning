package com.test.innerclasses;

public class MainClass3 {

	public static void main(String[] args) {
		AnonymousClassExample anonymousInnerClass=new AnonymousClassExample();
		anonymousInnerClass.getTestClass().b();  //this method is overridden by innerclass
		anonymousInnerClass.getTestClass().a();
		
	}
}
