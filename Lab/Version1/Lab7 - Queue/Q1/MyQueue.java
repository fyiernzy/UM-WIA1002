package Lab7.Q1;

import java.util.Arrays;
import java.util.LinkedList;

public class MyQueue<E> {
	LinkedList<E> lList;
	
	public MyQueue() {
		this.lList = new LinkedList<E>();
	}
	
	public MyQueue(E[] e) {
		this();
		Arrays.stream(e).forEach(lList::add);
	}
	
	public void enqueue(E e) {
		lList.addLast(e);
	}
	
	public E dequeue() {
		return lList.removeFirst();
	}
	
	public E getElement(int i) {
		return lList.get(i);
	}
	
	public E peek() {
		return lList.getFirst();
	}
	
	public int getSize() {
		return lList.size();
	}
	
	public boolean contains(E e) {
		return lList.contains(e);
	}
	
	public boolean isEmpty() {
		return lList.isEmpty();
	}
	
	@Override
	public String toString() {
		return lList.toString();
	}
}
