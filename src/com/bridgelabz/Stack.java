package com.bridgelabz;

public class Stack {
	// LIFO
	static LinkedList list = new LinkedList();

	// Push : Adding elements
	public void push(Object data) {
		list.addFirst(data);
	}

	// Pop : Deleting elements
	public void pop() {
		list.deleteFirst();
	}

	// TO display
	public void showElements() {
		list.display();
	}
}
