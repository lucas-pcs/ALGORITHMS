package stack;

import stack.interfaces.Stack;
import stack.array.ArrayStack;
import stack.linkedlist.LinkedListStack;
import client.Client;

public class StackFactory {
	public static <Item> Stack<Item> createStack(StackType typeOfImplementation) {
		switch(typeOfImplementation) {
			case ARRAY:
				return new ArrayStack<Item>();
			case LINKED_LIST:
				return new LinkedListStack<Item>();
			default:
				throw new IllegalArgumentException("Invalid Stack implementation");
		}
	}

	public enum StackType {
		ARRAY,
		LINKED_LIST;
	}
}