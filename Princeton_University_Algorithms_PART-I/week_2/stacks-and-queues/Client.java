import Stack.LinkedList.Stack;

public class Client {
	public static void main(String[] args) {
		System.out.println("main - begin...");
		
		testStackLinkedList();
		
		System.out.println("main - ...end");
	}
	
	public static void testStackLinkedList() {
		// test Stack implementation using LinkedList
		int first = 1;
		int second = 2;
		int third = 3;
		
		// instanciate stack object
		Stack<Integer> mStack = new Stack<Integer>();
		
		System.out.println("stack isEmpty: " + mStack.isEmpty());
		System.out.println("stack size: " + mStack.size());
		System.out.println("stack push: " + first);
		mStack.push(Integer.valueOf(first));
		
		System.out.println("\nstack isEmpty: " + mStack.isEmpty());
		System.out.println("stack size: " + mStack.size());
		System.out.println("stack push: " + second);
		mStack.push(Integer.valueOf(second));

		System.out.println("\nstack isEmpty: " + mStack.isEmpty());
		System.out.println("stack size: " + mStack.size());
		System.out.println("stack push: " + third);
		mStack.push(Integer.valueOf(third));
		
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