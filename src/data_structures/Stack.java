package data_structures;

import java.util.Iterator;

public class Stack<E extends Comparable<E>> implements Iterable<E> {
	private LinearListADT<E> stack;
	
	/*
	 * Default constructor
	 */
	public Stack() {
		this.stack = new LinearList<E>();
	}

	/*
	 * inserts the object obj into the stack
	 */
	public void push(E obj) {
		this.stack.addFirst(obj);
	}

	/*
	 * pops and returns the element on the top of the stack
	 */
	public E pop() {
		return (E) this.stack.removeFirst();

	}

	/*
	 * returns the number of elements currently in the stack
	 */
	public int size() {
		return this.stack.size();

	}

	/*
	 * return true if the stack is empty, otherwise false
	 */
	public boolean isEmpty() {
		return this.stack.isEmpty();

	}

	/*
	 * returns but does not remove the element on the top of the stack
	 */
	public E peek() {
		return (E) this.stack.peekFirst();

	}

	/*
	 * returns true if the object obj is in the stack, otherwise false
	 */
	public boolean contains(E obj) {
		return stack.contains(obj);

	}

	/*
	 * returns the stack to an empty state
	 */
	public void makeEmpty() {
		this.stack.clear();
	}

	/*
	 * removes the Object obj if it is in the stack and returns true, otherwise
	 * returns false.
	 */
	public boolean remove(E obj) {
		return this.stack.remove(obj) != null;
	}

	/*
	 * returns a iterator of the elements in the stack. The elements must be in the
	 * same sequence as pop() would return them.
	 */
	public Iterator<E> iterator() {
		return this.stack.iterator();

	}
}
