package com.test.datastructure;

public class DoubleNode {

	private Value value;

	private DoubleNode next;
	
	private DoubleNode previous;

	public Object getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}

	public DoubleNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoubleNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "DoubleNode [value=" + value + "]";
	}



	
}
