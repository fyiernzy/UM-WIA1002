package Lab5;

import java.util.*;

public class ArrayBag<T> implements BagInterface<T> {
	private static int DEFAULT_CAPACITY = 25;
	public T[] bag;
	private int numberOfEntries;
	
	public ArrayBag() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayBag(T[] bag) {
		this.bag = bag;
		numberOfEntries = bag.length;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayBag(int capacity) {
		bag = (T[]) new Object[capacity];
	}
	
	@Override
	public int getCurrentSize() {
		return numberOfEntries;
	}
	
	@Override
	public boolean isFull() {
		return bag.length == numberOfEntries;
	}
	
	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}
	
	@Override
	public boolean add(T newEntry) {
		if(isFull()) 
			return false;
		
		bag[numberOfEntries++] = newEntry;
		return true;
	}
	
	@Override
	public T remove() {
		return remove((int)(Math.random() * this.numberOfEntries));
	}
	
	@Override
	public boolean remove(T entry) {
		int index = indexOf(entry);
		return remove(index) == null ? false : true;
	}
	
	T remove(int index) {
		if(index < 0 || index >= this.bag.length || this.isEmpty())
			return null;
		
		T item = bag[index];
		
		for(int i = index; i < this.numberOfEntries - 1; i++) {
			bag[i] = bag[i + 1];
		}
		
		bag[--numberOfEntries] = null;
		
		return item;
	}
	
	@Override
	public void clear() {
		Arrays.fill(bag, null);
		numberOfEntries = 0;
	}
	
	@Override
	public int getFrequencyOf(T entry) {
		int count = 0;
		
		for(int i = 0; i < numberOfEntries; i++) {
			count += ((bag[i]).equals(entry)) ? 1 : 0;
		}
		
		return count;
	}
	
	@Override
	public boolean contains(T entry) {
		return indexOf(entry) >= 0;
	}
	
	int indexOf(T entry) {
		Object[] es = bag;
		
		if(entry == null) {
			for(int i = 0; i < numberOfEntries; i++) {
				if(entry == es[i])
					return i;
			}
		} else {
			for(int i = 0; i < numberOfEntries; i++) {
				if(entry.equals(es[i]))
					return i;
			}
		}
		
		return -1;
	}
	
	@Override @SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] resultArr = (T[]) new Object[numberOfEntries];
        System.arraycopy(bag, 0, resultArr, 0, numberOfEntries);
        return resultArr;
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray(T[] a) {
		return (T[]) Arrays.copyOf(bag, Math.min(a.length, numberOfEntries), a.getClass());
	}
	
	@Override 
	public BagInterface<T> union(BagInterface<T> anotherBag) {
		int size1 = getCurrentSize(), size2 = anotherBag.getCurrentSize();
		ArrayBag<T> newBag = new ArrayBag<>(size1 + size2);
		
		T[] arr1 = this.toArray();
		T[] arr2 = anotherBag.toArray();
		
        for (int i = 0; i < arr1.length; i++) {
            newBag.add((T) arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            newBag.add((T) arr2[i]);
        }
        
        return newBag;
	}
	
	@Override
	public BagInterface<T> intersection(BagInterface<T> anotherBag) {
		return batchRemove(anotherBag, false);
	}
	
	@Override
	public BagInterface<T> difference(BagInterface<T> anotherBag) {
		return batchRemove(anotherBag, true);
	}
	
	public BagInterface<T> batchRemove(BagInterface<T> anotherBag, boolean complement) {
		BagInterface<T> newBag = new ArrayBag<T>(numberOfEntries);
		
		for(int i = 0; i < numberOfEntries; i++) {			
			if(newBag.contains(bag[i])) 
				continue;
			
			int freq1 = getFrequencyOf(bag[i]);
			int freq2 = anotherBag.getFrequencyOf(bag[i]);
			int end = (complement) ? freq1 - freq2 : Math.min(freq1, freq2);
			
			for(int j = 0; j < end; j++)
				newBag.add(bag[i]);
		}
		
		return new ArrayBag<T>(newBag.toArray());
	}	
	
}
