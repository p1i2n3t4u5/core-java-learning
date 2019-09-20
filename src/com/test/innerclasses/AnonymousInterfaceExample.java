package com.test.innerclasses;

public class AnonymousInterfaceExample {
	
	//this section is called anonymous class
	TestInterface testInterface=new TestInterface() {
			
			@Override
			public void b() {
				System.out.println("AnonymousInterfaceExample a()");
				
			}
			
			@Override
			public void a() {
				System.out.println("AnonymousInterfaceExample b()");
				
			}
		};

	public TestInterface getTestInterface() {
		return testInterface;
	}

	public void setTestInterface(TestInterface testInterface) {
		this.testInterface = testInterface;
	}


}
