package stack.array;

import java.util.EmptyStackException;
import stack.interfaces.Stack;

public class ArrayStack<Item> implements Stack<Item> {
	private int capacity = 1;
	private int N = 0;
	private Item[] stack;

	public ArrayStack() {
		stack = (Item[]) new Object[capacity];
	}

	@Override
	public void push(Item item) {
		N++;
		resizeArray(checkArrayCapacity());
		stack[N-1] = item;
	}

	@Override
	public Item pop() {
		if(isEmpty()) throw new EmptyStackException();
		N--;
		stack[N+1] = null;
		Item item = stack[N];
		resizeArray(checkArrayCapacity());
		return item;
	}

	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public void printStack() {
		System.out.println("Printing stack elements: ");
		for(int i = N-1; i >= 0; i--) System.out.println(stack[i]);
	}

	public enum arrayFill{
		KEEP,
		INCREASE,
		DECREASE;
	}

	public arrayFill checkArrayCapacity() {
		if(capacity == N) return arrayFill.INCREASE;

		else if(capacity/4 >= N) return arrayFill.DECREASE;

		else return arrayFill.KEEP;
	}


	public void resizeArray(arrayFill status) {
		if(status == arrayFill.KEEP){
			return;
		} else if(status == arrayFill.DECREASE) {
			capacity = capacity / 2;
		} else {
			capacity = capacity * 2;
		}
		Item[] newStack = (Item[]) new Object[capacity];
		for(int i = 0; i < N; i++) newStack[i] = stack[i];
		stack = newStack;
	}

}