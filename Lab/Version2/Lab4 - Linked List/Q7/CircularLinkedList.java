package Lab4.Q7;

import java.util.NoSuchElementException;

public class CircularLinkedList<E> {
	int length;
	ListNode<E> head;
	ListNode<E> tail;
	
	public int length() {
		return length;
	}
	
	public void addCircularNode(E elem) {
		ListNode<E> newNode = new ListNode<E>(elem, head);
		if(head == null) {
			head = newNode;
			newNode.next = newNode;
		} else {
			tail.next = newNode;
		}
		
		tail = newNode;
		length++;
	}
	
	public E deleteCircularNode() {
		ListNode<E> lastNode = tail;
		E elem = lastNode.elem;
		tail = node(length - 2);
		tail.next = head;
		
		// Helps GC
		lastNode.elem = null;
		lastNode.next = null;
		
		length--;
		return elem;
	}
	
	public void displayCircularList() {
		ListNode<E> node = head;
		for(int i = 0; (i / (length + 1)) == 0; i++, node = node.next) 
			System.out.print(node.elem + " --> ");
		System.out.println();
	}
	
	public E getCircularItem(int i) {
		if(i < 0 || i >= length)
			throw new NoSuchElementException();
		return node(i).elem;
	}
	
	ListNode<E> node(int index) {
		ListNode<E> node = head;
		for(int i = 0; i < index; i++) 
			node = node.next;
		return node;
	}
}
