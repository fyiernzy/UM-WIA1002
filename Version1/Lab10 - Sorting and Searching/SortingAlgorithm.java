package Lab10;

public abstract class SortingAlgorithm {
	protected String name;
	
	SortingAlgorithm(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public String name() {
		return this.name;
	}
	
	abstract <T extends Comparable<T>> void sort(T[] arr, boolean isAscending);
	
	public <T extends Comparable<T>> void sort(T[] arr) {
		sort(arr, true);
	}
	
	public <T extends Comparable<T>> void sortDescending(T[] arr) {
		sort(arr, false);
	}
}
