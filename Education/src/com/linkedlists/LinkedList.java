package com.linkedlists;


public class LinkedList {
	//Added as internal per instruction, but do not understand why.
	//reason is it is part of the implementation of the LinkedList.
	//It is an implementation detail.
	//My questions are: 
	//1) If it is only to be used in this class, then why make a class out of it at all
	//reason is it is part of the implementation of the LinkedList.
	//It is an implementation detail.
	//2) If it is a class, then why should it not be more accessible outside of thise?
	//3) Why node include as variable and method of this class(LinkedList) and not
	//   as a separate class?
	private class Node {
		private int value;
		private Node next;
		public Node(int value) {
			this.value = value;
		}
	};
	
	private Node first;
	private Node last;
	
	public void addFirst(int item) {
		var node = new Node(item);
		
		if ( isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}
	//deleteFirst
	public void deleteFirst() {
		if ( isEmpty() ){}
			//throw new Exception( 
	}
	//deleteLast
	public void deleteLast() {
		
	}
	public void addLast(int item) {
		var node = new Node(item);
		
		//Is the list empty?
		if ( isEmpty() )
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
	}
	
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while (current != null) {
			if (current.value == item )
				return index;
			current = current.next; //Point to next item.
			index++;
		}
		return -1;
	}
	public boolean contains(int item) {
		if (indexOf(item) == -1 )
			return false;
		else return true;
	}
	private boolean isEmpty() {
		//This was new to me. It returns the boolean of the evaluation
		return first == null;
	}
}
