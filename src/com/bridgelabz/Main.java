/*
 *Ability to dequeue from the beginning
 */
package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Stacks and Queues Problems");
		Queue queue = new Queue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.showElements();
		queue.dequeue();
		queue.showElements();
		queue.dequeue();
		queue.showElements();
		queue.dequeue();
		queue.showElements();
	}
}
