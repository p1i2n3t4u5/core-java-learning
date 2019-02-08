package com.test.datastructure;

public class DoubleNode {

	private Object value;

	private SingleNode next;
	
	private SingleNode previous;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public SingleNode getNext() {
		return next;
	}

	public void setNext(SingleNode next) {
		this.next = next;
	}

	public SingleNode getPrevious() {
		return previous;
	}

	public void setPrevious(SingleNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "DoubleNode [value=" + value + ", next=" + next + ", previous=" + previous + "]";
	}
	
	
}
