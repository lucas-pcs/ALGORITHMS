package client;

import stack.StackFactory;
import stack.interfaces.Stack;

public class Client {
	public static void main(String[] args) {
		System.out.println("main - begin...\n");
		
		testStack();
		
		System.out.println("\nmain - ...end");
	}

	public static void testStack() {
		// using integers
		/*int first = 1;
		int second = 2;
		int third = 3;*/
		
		// using Strings
		String first = "first";
		String second = "second";
		String third = "third";

		Stack<String> mStack = StackFactory.createStack(StackFactory.StackType.ARRAY);
		
		// test
		System.out.println("stack isEmpty: " + mStack.isEmpty());
		System.out.println("stack size: " + mStack.size());
		System.out.println("");

		System.out.println("stack push: " + first);
		mStack.push(first);
		System.out.println("stack push: " + second);
		mStack.push(second);
		System.out.println("stack push: " + third);
		mStack.push(third);
		
		System.out.println("");
		mStack.printStack();
		System.out.println("");

		System.out.println("stack pop: " + mStack.pop());
		System.out.println("stack pop: " + mStack.pop());
		System.out.println("stack pop: " + mStack.pop());
		//System.out.println("\nstack isEmpty: " + mStack.isEmpty());
		//System.out.println("stack pop: " + mStack.pop());
	}
}