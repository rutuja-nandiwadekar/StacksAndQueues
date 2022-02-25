/*
 *Ability to create a Stack of 56->30->70
 *So 70 will be added first then 30 and then 56 to make 56 on top of the Stack
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
	}
}
