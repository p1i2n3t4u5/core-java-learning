package com.test.innerclasses;

public class AnonymousClassExample {
	
	//this section is called anonymous class
	TestClass testClass=new TestClass(){
		@Override
		public void b() {
			System.out.println("AnonymousClassExample b()");
		}; 
	};

	public TestClass getTestClass() {
		return testClass;
	}

	public void setTestClass(TestClass testClass) {
		this.testClass = testClass;
	}
	
	

}
