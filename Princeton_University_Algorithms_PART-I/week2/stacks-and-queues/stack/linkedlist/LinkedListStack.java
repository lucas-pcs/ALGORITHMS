package stack.linkedlist;

import java.util.EmptyStackException;
import stack.interfaces.Stack;

public class LinkedListStack<Item> implements Stack<Item> {

	private Node first = null;
	
	public class Node {
		Item item;
		Node next;
	}
	
	@Override
	public void push(Item item) {
		Node newNode = new Node();
		newNode.item = item;
		newNode.next = first;
		first = newNode;
	}

	@Override
	public Item pop() {
		if(isEmpty()) throw new EmptyStackException();
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	@Override
	public int size() {
		int counter = 0;
		Node iterator = first;
		if(isEmpty()) return 0;
		counter++;
		while (iterator.next != null) {
		iterator = iterator.next;
		counter++;
		}
		return counter;
	}
	
	@Override
	public void printStack() {
		Node iterator = first;
		System.out.print("printing stack: ");
		while(iterator != null) {
			System.out.print(iterator.item + " ");
			iterator = iterator.next;
		}
			System.out.print("\n");
	}
	
}