package Lab10;

public class InsertionSort extends SortingAlgorithm {

	public static final String NAME = "Insertion Sort";

	InsertionSort() {
		super(NAME);
	}

	public <T extends Comparable<T>> void sort(T[] arr, boolean isAscending) {
		int flag = isAscending ? 1 : -1;
		
		for (int i = 1; i < arr.length; i++) {
			T key = arr[i];
			int j = i - 1;

			while (j >= 0 && flag * arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}

	}

}
