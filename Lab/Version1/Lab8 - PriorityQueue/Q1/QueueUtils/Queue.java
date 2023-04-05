package Lab8.Q1.QueueUtils;

public interface Queue<E> {
	public String toString();
	public E poll();
	public void add(E o);
	public Object[] toArray();
	public E peek();
	public boolean contains(E o);
	public int size();
	public boolean isEmpty();
}
