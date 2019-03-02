package data_structures;

import java.util.Iterator;

public class Queue<E extends Comparable<E>> implements Iterable<E> {

	/*
	 * inserts the object obj into the queue
	 */
	public void enqueue(E obj) {

	}

	/*
	 * removes and returns the object at the front of the queue
	 */
	public E dequeue() {
		return null;

	}

	/*
	 * returns the number of objects currently in the queue
	 */
	public int size() {
		return 0;

	}

	/*
	 * returns true if the queue is empty, otherwise false
	 */
	public boolean isEmpty() {
		return false;

	}

	/*
	 * returns but does not remove the object at the front of the queue
	 */
	public E peek() {
		return null;

	}

	/*
	 * returns true if the Object obj is in the queue
	 */
	public boolean contains(E obj) {
		return false;

	}

	/*
	 * returns the queue to an empty state
	 */
	public void makeEmpty() {

	}

	/*
	 * removes the Object obj if it is in the queue and returns true, otherwise
	 * returns false.
	 */
	public boolean remove(E obj) {
		return false;

	}

	/*
	 * returns an iterator of the elements in the queue. The elements must be in the
	 * same sequence as dequeue would return them.
	 */
	public Iterator<E> iterator() {
		return null;

	}
}
