package Lab4.Q6;

public class DoubleListNode<E> {
	E element;
	DoubleListNode<E> prev;
	DoubleListNode<E> next;

	DoubleListNode(DoubleListNode<E> prev, E element, DoubleListNode<E> next) {
		this.prev = prev;
		this.element = element;
		this.next = next;
	}
}
