package Lab2.Q2;

public interface SimpleLog<T> {
	public boolean insert(T item);
	public boolean isFull();
	public int size();
	public boolean contains(T item);
	public boolean delete(T item);
	public void display();
	public void clear();
}
