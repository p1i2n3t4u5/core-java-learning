package com.test.datastructure;

public class Main {
	public static void main(String[] args) {

		Main main = new Main();
		SingleNode head = main.createLinkedList();
		main.printAll(head);
		SingleNode head2 = main.reverse(head);
		main.printAll(head2);
	}

	public SingleNode createLinkedList() {
		
		SingleNode head = null; //ref3

		for (int i = 0; i < 10; i++) {
			SingleNode node = new SingleNode();
			node.setValue(new Value(i + ""));
				node.setNext(head);
			head = node;
		}
		System.out.println(""+head.getValue());
		System.out.println(head.getNext().getValue());
		System.out.println(head.getNext().getNext().getValue());

		return head;
	}
	
	public void printAll(SingleNode head) {
		System.out.println(head);
		SingleNode temp=head;
		while (temp.getNext()!=null) {
			System.out.println(temp.getValue());
			temp=temp.getNext();
		}
	}
	
	public SingleNode  reverse(SingleNode head) {
		SingleNode current=head;
		SingleNode previousNode=null;
		SingleNode nextNode=null;
		while (current.getNext()!=null) {
			
			previousNode=current.getNext();
			current.setNext(nextNode);
			current=previousNode.getNext();
			nextNode=previousNode.getNext();
			previousNode.setNext(current);
			
		}
		
		return current;
	}
	

}
