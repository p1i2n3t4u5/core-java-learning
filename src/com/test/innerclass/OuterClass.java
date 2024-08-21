package com.test.innerclass;

public class OuterClass {

	private int count;
	
	private static int sum;

	public void setCount(int count) {
		this.count = count;
	}
	
	public static void setSum(int sum) {
		OuterClass.sum = sum;
	}

	public class B {
		private int total;
		

		public void setTotal(int total) {
			this.total = total;
		}

		public void print() {
			System.out.println(count);
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.setCount(10);
		OuterClass.B innerClass = outerClass.new B();
		innerClass.print();
		OuterClass.setSum(1000);
		innerClass.print();

	}

}
