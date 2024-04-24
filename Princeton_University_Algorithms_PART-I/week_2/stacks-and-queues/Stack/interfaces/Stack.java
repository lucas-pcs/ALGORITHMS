package stack.interfaces;

public interface Stack<Item> {
	void push(Item item);

	Item pop();

	boolean isEmpty();

	int size();

	void printStack();
}