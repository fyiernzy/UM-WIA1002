package Lab10;


public class BubbleSort extends SortingAlgorithm {
	public static final String NAME = "Bubble Sort";
	
	BubbleSort() {
		super(NAME);
	}
	
	public <T extends Comparable<T>> void sort(T[] arr, boolean isAscending) {
		int flag = (isAscending) ? 1 : -1;
		boolean isSwap = false;
		
		for(int i = 0; i < arr.length; i++) {
			isSwap = false;
			for(int j = 0; j < arr.length - 1; j++) {
				if(flag * arr[j].compareTo(arr[j + 1]) > 0) {
					T tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					isSwap = true;
				}
			}
			
			if(!isSwap) break; 
		}
	}
}
