public class Stack {

	private Stack first = null;
	
	public class Node() {
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
		Node temp = first
		first = first.nextNode
		return temp
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		int counter = 0;
		while (first.nextNode != null) {
		first = first.nextNode;
		counter++;
		}
		return counter;
	}
	
}