import stack.array.ArrayStack;
import stack.StackFactory;
import stack.interfaces.Stack;

public class Client {
	public static void main(String[] args) {
		System.out.println("main - begin...");
		
		testStack();
		//testStackArray();
		
		System.out.println("main - ...end");
	}

	/*public static void testStackArray() {
		
		Stack<Integer> mStack = newStack<Integer>();
		
	}*/
	
	public static void testStack() {
		// setup
		
		// using integers
		/*int first = 1;
		int second = 2;
		int third = 3;
		Stack<Integer> mStack = new Stack<Integer>();*/
		
		// using Strings
		String first = "first";
		String second = "second";
		String third = "third";

		
		//Stack<String> mStack = new Stack<String>();
		// 0 -> Array
		Stack<String> mStack = StackFactory.createStack(0);
		
		// test
		System.out.println("stack isEmpty: " + mStack.isEmpty());
		System.out.println("stack size: " + mStack.size());
		System.out.println("stack push: " + first);
		mStack.push(first);
		
		System.out.println("\nstack isEmpty: " + mStack.isEmpty());
		System.out.println("stack size: " + mStack.size());
		System.out.println("stack push: " + second);
		mStack.push(second);

		System.out.println("\nstack isEmpty: " + mStack.isEmpty());
		System.out.println("stack size: " + mStack.size());
		System.out.println("stack push: " + third);
		mStack.push(third);
		
		System.out.println("");
		mStack.printStack();
		
		System.out.println("\npop all elements of stack\n");
		System.out.println("stack pop: " + mStack.pop());
		System.out.println("stack pop: " + mStack.pop());
		System.out.println("stack pop: " + mStack.pop());
		System.out.println("\nstack isEmpty: " + mStack.isEmpty());
		System.out.println("stack pop: " + mStack.pop());
	}
}