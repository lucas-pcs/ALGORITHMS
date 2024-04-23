package libs;

public class Stack {

	private Node first = null;
	
	public class Node {
		String item;
		Node next;
	}
	
	public void push(String item) {
		Node newNode = new Node();
		newNode.item = item;
		newNode.next = first;
		first = newNode;
	}
	
	public String pop() {
		Node oldFirst = first;
		first = first.next;
		return oldFirst.item;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		int counter = 0;
		if(isEmpty()) return 0;
		while (first.next != null) {
		first = first.next;
		counter++;
		}
		return counter;
	}
	
}