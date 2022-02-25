/*
 *Ability to peak and pop from the Stack till it is empty 56 ->30 ->70
 */
package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Stacks and Queues Problems");
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.showElements();

		stack.pop();
		stack.showElements();
		stack.pop();
		stack.showElements();
		stack.pop();
		stack.showElements();
	}
}
