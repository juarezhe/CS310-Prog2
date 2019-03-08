/*
 * Program #2 Queue that implements a behind-the-scenes LinearList
 * 
 * CS-310
 * 
 * 13 March 2019
 * 
 * @author Hannah Juarez cssc1481
 */

package data_structures;

import java.util.Iterator;

public class Queue<E extends Comparable<E>> implements Iterable<E> {
	private LinearListADT<E> queue;

	/*
	 * Default constructor
	 */
	public Queue() {
		this.queue = new LinearList<E>();
	}

	/*
	 * inserts the object obj into the queue
	 */
	public void enqueue(E obj) {
		this.queue.addLast(obj);
	}

	/*
	 * removes and returns the object at the front of the queue
	 */
	public E dequeue() {
		return (E) this.queue.removeFirst();
	}

	/*
	 * returns the number of objects currently in the queue
	 */
	public int size() {
		return this.queue.size();
	}

	/*
	 * returns true if the queue is empty, otherwise false
	 */
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}

	/*
	 * returns but does not remove the object at the front of the queue
	 */
	public E peek() {
		return (E) this.queue.peekFirst();
	}

	/*
	 * returns true if the Object obj is in the queue
	 */
	public boolean contains(E obj) {
		return this.queue.contains(obj);
	}

	/*
	 * returns the queue to an empty state
	 */
	public void makeEmpty() {
		this.queue.clear();
	}

	/*
	 * removes the Object obj if it is in the queue and returns true, otherwise
	 * returns false.
	 */
	public boolean remove(E obj) {
		return this.queue.remove(obj) != null;
	}

	/*
	 * returns an iterator of the elements in the queue. The elements must be in the
	 * same sequence as dequeue would return them.
	 */
	public Iterator<E> iterator() {
		return this.queue.iterator();
	}
}
