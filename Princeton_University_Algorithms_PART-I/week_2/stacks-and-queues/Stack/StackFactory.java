package stack;

import stack.interfaces.Stack;
import stack.array.ArrayStack;

public class StackFactory {
	// 0 -> Array
	// 1 -> LinkedList
	public static <Item> Stack<Item> createStack(int typeOfImplementation) {
		if(typeOfImplementation == 0) return new ArrayStack<Item>();
		//if(typeOfImplementation == 1) return new LinkedList<Item>();
		throw new IllegalArgumentException("Invalid Stack implementation");
	}
}