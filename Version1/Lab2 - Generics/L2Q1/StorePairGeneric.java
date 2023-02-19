package Lab2.L2Q1;

public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
	private T first, second;
	
	public StorePairGeneric(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return this.first;
	}
	
	public T getSecond() {
		return this.second;
	}
	
	public void setPair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "first = " + first + " second = " + second;
	}
	
	@Override
    public int compareTo(StorePairGeneric<T> another) {
        return this.first.compareTo(another.first);
    }
	
	@Override
	public boolean equals(Object anotherObject) {
		if (!(anotherObject instanceof StorePairGeneric)) 
	        return false;
	    if (!(anotherObject.getClass().equals(this.getClass()))) 
	        return false;
	    
	    @SuppressWarnings("unchecked")
		StorePairGeneric<T> another = (StorePairGeneric<T>) anotherObject;
	    return another.getFirst().equals(this.getFirst());
	}
	
	
}
