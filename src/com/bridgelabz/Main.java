/*
 *Ability to create a Queue of 56->30->70
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
	}
}
