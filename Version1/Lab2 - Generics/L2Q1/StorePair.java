package Lab2.L2Q1;

public class StorePair implements Comparable<StorePair>{
	private int first, second;
	
	
	public StorePair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public int getFirst() {
		return this.first;
	}
	 
	public int getSecond() {
		return this.second;
	}
	 
	public void setPair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public int compareTo(StorePair another) {
		return this.getFirst() - another.getFirst();
	}
	
	@Override
	public String toString() {
		return "first = " + first + " second = " + second;
	}
	
	@Override
	public boolean equals(Object anotherObject) {
		if (!(anotherObject instanceof StorePair)) 
	        return false;
		
		StorePair another = (StorePair) anotherObject;
	    return another.getFirst() == this.getFirst();
	}

}
