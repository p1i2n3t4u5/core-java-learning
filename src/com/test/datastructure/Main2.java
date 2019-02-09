package com.test.datastructure;

public class Main2 {
	private DoubleNode tailNode = null;
	private DoubleNode headNode = null;

	public static void main(String[] args) {
		Main2 main2 = new Main2();
		main2.createDoubleLinkedList();

		main2.printAllFromHead(main2.headNode);
		main2.printAllFromTail(main2.tailNode);

	}

	public void createDoubleLinkedList() {

		DoubleNode previous = null;

		for (int i = 0; i < 10; i++) {
			DoubleNode doubleNode = new DoubleNode();
			if (previous != null) {
				previous.setNext(doubleNode);
			}
			doubleNode.setPrevious(previous);
			doubleNode.setValue(new Value(i + ""));
			previous = doubleNode;
			// for keeping head and tail
			tailNode = doubleNode;
			if (i == 0) {
				headNode = doubleNode;
			}

		}
	}

	public void printAllFromHead(DoubleNode head) {
		System.out.println(head);
		DoubleNode temp = head;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}
	
	
	public void printAllFromTail(DoubleNode tail) {
		System.out.println(tail);
		DoubleNode temp = tail;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getPrevious();
		}
	}

}
