package com.test.datastructure;

public class Value {
	
	private String value;

	public Value(String value ) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
	

}
