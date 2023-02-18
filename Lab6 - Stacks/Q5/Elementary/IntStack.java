package Lab6.Q5.Elementary;

import java.util.Iterator;
import java.util.Stack;

public class IntStack {
	Stack<Integer> stack;
	
	IntStack() {
		stack = new Stack<Integer>();
	}
	
	public int pop() {
		return stack.pop();
	}
	
	public int peek() {
		return stack.peek();
	}
	
	public void push(int i) {
		stack.push(i);
	}
	
	public Iterator<Integer> iterator() {
		return stack.iterator();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
}
