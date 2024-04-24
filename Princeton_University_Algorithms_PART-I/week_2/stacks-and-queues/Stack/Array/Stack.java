package Stack.Array;

import java.util.EmptyStackException;

public class Stack<Item> {
	private int capacity = 1;
	private int N = 0;
	private Item[] stack;

	public Stack() {
		stack = (Item[]) new Object[capacity];
	}

	public void push(Item item) {
		N++;
		resizeArray(checkArrayCapacity());
		stack[N-1] = item;
	}

	public Item pop() {
		if(isEmpty()) throw new EmptyStackException();
		N--;
		stack[N+1] = null;
		Item item = stack[N];
		resizeArray(checkArrayCapacity());
		return item;
	}

	public arrayFill checkArrayCapacity() {
		if(capacity == N) return arrayFill.INCREASE;

		else if(capacity/4 >= N) return arrayFill.DECREASE;

		else return arrayFill.KEEP;
	}

	public enum arrayFill{
		KEEP,
		INCREASE,
		DECREASE;
	}

	public void resizeArray(arrayFill status) {
	System.out.println("arrayFill status: " + status + " number of elements: " + N + " array capacity: " + capacity);
		if(status == arrayFill.KEEP){
			return;
		} else if(status == arrayFill.DECREASE) {
			System.out.println("decreasing array size");
			capacity = capacity / 2;
		} else {
			System.out.println("increasing array size");
			capacity = capacity * 2;
		}
		Item[] newStack = (Item[]) new Object[capacity];
		for(int i = 0; i < N; i++) newStack[i] = stack[i];
		stack = newStack;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	// for debugging purposes
	public void printStack() {
		System.out.println("Printing stack elements: ");
		for(int i = N-1; i >= 0; i--) System.out.println(stack[i]);
	}
}