package com.linkedlists;

public class LinkListTests {
	public static void main(String[] args) {
		var list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(20));
		System.out.println(list.indexOf(30));
		System.out.println(list.indexOf(40));
		System.out.println(list.indexOf(100));
		System.out.println(list.contains(100));
		System.out.println(list.contains(10));
		
		
	}
}
