package Lab10;

public class SelectionSort extends SortingAlgorithm {
	public static final String NAME = "Selection Sort";

	SelectionSort() {
		super(NAME);
	}
	
	public <T extends Comparable<T>> void sort(T[] arr, boolean isAscending) {
		int flag = (isAscending) ? 1 : -1;
		
		for(int i = 0; i < arr.length - 1; i++) {
			int index = i;
			
			for(int j = 1 + i; j < arr.length; j++) {
				// if isAscending = true, index = minIndex else index = maxIndex
				if(flag * arr[j].compareTo(arr[index]) < 0)  
					index = j;
			}
			
			if(index != i) {
				T tmp = arr[i];
				arr[i] = arr[index];
				arr[index] = tmp;
			}
		}
	}
	
	
}
