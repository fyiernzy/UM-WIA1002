package Lab6.Q1;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
	private ArrayList<E> stack;
	
	public MyStack() {
		stack = new ArrayList<E>();
	}
	
	public void push(E element) {
		stack.add(element);
	}
	
	public E pop() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack.remove(stack.size() - 1);
	}
	
	public E peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack.get(stack.size() - 1);
	}
	
	public int getSize() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.size() == 0;
	}
	
	@Override
	public String toString() {
		return stack.toString();
	}
	
	public boolean search(E element) {
		return stack.contains(element);
	}
}
