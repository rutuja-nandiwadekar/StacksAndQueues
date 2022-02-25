package com.bridgelabz;

public class Queue {
	// FIFO
	static LinkedList list = new LinkedList();

	// Adding elements: Enqueue
	public void enqueue(Object data) {
		list.addLast(data);
	}

	// Deleting elements: Dequeue
	public void dequeue() {
		list.deleteFirst();
	}

	// to display
	public void showElements() {
		list.display();
	}
}
