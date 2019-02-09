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

		for (int i = 0; i < 11; i++) {
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
		while (temp!=null) {
			System.out.println(temp.getValue());
			temp=temp.getNext();
		}
	}
	
	public SingleNode  reverse(SingleNode head) {
		
		SingleNode newHead=null;
		SingleNode current=head;
		SingleNode nextNode=null;
		SingleNode nextNextNode=null;
		SingleNode someNode=null;
		while (current!=null ) {
			nextNode=current.getNext();
			if (nextNode!=null) {
				nextNextNode=nextNode.getNext();
				if(nextNextNode== null) {
					newHead=nextNode;
				}
			}else {
				newHead=current;
				nextNextNode = null;
			}
			
			if (nextNode!=null) {
				nextNode.setNext(current);
			}
			current.setNext(someNode);
			someNode=nextNode;
			current=nextNextNode;
		}
		
		return newHead;
	}
	

}
