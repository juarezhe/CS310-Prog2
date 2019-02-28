/*
 * Program #2 Linked-list based data structure
 * 
 * CS-310
 * 
 * 13 March 2019
 * 
 * @author Hannah Juarez cssc1481
 */

package data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class LinearList<E extends Comparable<E>> implements LinearListADT<E> {
	class Node<T> {
		Node<T> next, previous;
		T data;

		public Node(T dataToStore) {
			this.data = dataToStore;
			this.next = this.previous = null;
		}
	}

	private Node<E> head, tail;
	private int currentSize;
	private long modificationCounter;

	/*
	 * Default constructor
	 */
	public LinearList() {
		this.head = this.tail = null;
		this.currentSize = 0;
		this.modificationCounter = 0;
	}

	/*
	 * Adds the Object obj to the beginning of list and returns true if the list is
	 * not full. returns false and aborts the insertion if the list is full.
	 */
	@Override
	public boolean addFirst(E obj) {
		Node<E> newNode = new Node<E>(obj);

		newNode.next = this.head;
		this.head = newNode;
		this.currentSize++;
		this.modificationCounter++;
		return true;
	}

	/*
	 * Adds the Object obj to the end of list and returns true if the list is not
	 * full. returns false and aborts the insertion if the list is full.
	 */
	@Override
	public boolean addLast(E obj) {
		Node<E> newNode = new Node<E>(obj);
		newNode.previous = this.tail;
		this.tail = newNode;
		this.currentSize++;
		this.modificationCounter++;
		return true;
	}

	/*
	 * Removes and returns the parameter object obj in first position in list if the
	 * list is not empty, null if the list is empty.
	 */
	@Override
	public E removeFirst() {
		if (this.isEmpty())
			return null;
		E dataToReturn = this.head.data;
		this.head = this.head.next;
		this.currentSize--;
		this.modificationCounter++;
		return (E) dataToReturn;
	}

	/*
	 * Removes and returns the parameter object obj in last position in list if the
	 * list is not empty, null if the list is empty.
	 */
	@Override
	public E removeLast() {
		if (this.isEmpty())
			return null;
		E dataToReturn = this.tail.data;
		this.tail = this.tail.previous;
		this.currentSize--;
		this.modificationCounter++;
		return (E) dataToReturn;
	}

	/*
	 * Removes and returns the parameter object obj from the list if the list
	 * contains it, null otherwise. The ordering of the list is preserved. The list
	 * may contain duplicate elements. This method removes and returns the first
	 * matching element found when traversing the list from first position. Note
	 * that you may have to shift elements to fill in the slot where the deleted
	 * element was located.
	 */
	@Override
	public E remove(E obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Returns the first element in the list, null if the list is empty. The list is
	 * not modified.
	 */
	@Override
	public E peekFirst() {
		return this.head.data;
	}

	/*
	 * Returns the last element in the list, null if the list is empty. The list is
	 * not modified.
	 */
	@Override
	public E peekLast() {
		return this.tail.data;
	}

	/*
	 * Returns true if the parameter object obj is in the list, false otherwise. The
	 * list is not modified.
	 */
	@Override
	public boolean contains(E obj) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * Returns the element matching obj if it is in the list, null otherwise. In the
	 * case of duplicates, this method returns the element closest to front. The
	 * list is not modified.
	 */
	@Override
	public E find(E obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * The list is returned to an empty state.
	 */
	@Override
	public void clear() {
		this.head = this.tail = null;
		this.currentSize = 0;
		this.modificationCounter++;
	}

	/*
	 * Returns true if the list is empty, otherwise false
	 */
	@Override
	public boolean isEmpty() {
		return this.currentSize == 0;
	}

	/*
	 * Returns true if the list is full, otherwise false
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/*
	 * Returns the number of Objects currently in the list.
	 */
	@Override
	public int size() {
		return this.currentSize;
	}

	/*
	 * Returns an Iterator of the values in the list, presented in the same order as
	 * the underlying order of the list. (front first, rear last)
	 */
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
