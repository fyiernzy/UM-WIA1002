package Lab2.Q2;

public class TextFileLog<T> implements SimpleLog<T> {
	private static final int MAX = 5;
	private int maxSize;
	private int size;
	private T[] log;
	
	TextFileLog() {
		this(MAX);
	}
	
	@SuppressWarnings("unchecked")
	TextFileLog(int maxSize) {
		this.maxSize = maxSize;
		this.log = (T[]) new Object[maxSize];
	}
	
	public boolean insert(T item) {
		if(!isFull()) {
			log[size++] = item;
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(T item) {
		return indexOf(item) >= 0; 
	}
	
	public boolean delete(T item) {
		int i = indexOf(item);
		if(i >= 0) {
			for(; i < size - 1; i++) 
				log[i] = log[i + 1];
			log[--size] = null;
			return true;
		}
		return false;
	}
	
	public void display() {
		for(int i = 0; i < size; i++) 
			System.out.println(log[i]);
	}
	
	public void clear() {
		for(int i = 0; i < size; i++)
			log[i] = null;
		size = 0;
	}
	
	public int indexOf(T item) {
		if(item == null) {
			for(int i = 0; i < size; i++) 
				if(log[i] == item)
					return i;
		} else {
			for(int i = 0; i < size; i++) 
				if(log[i].equals(item))
					return i;
		}
		
		return -1;
	}
}
