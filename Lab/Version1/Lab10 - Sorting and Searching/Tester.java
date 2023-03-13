package Lab10;

import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		SortingAlgorithm[] algorithms = {new BubbleSort(), new InsertionSort(), new SelectionSort()};
		
		for(SortingAlgorithm algorithm : algorithms) {
			Integer[] arr = {1, 1, 5, 2, 2, 4, 3};
			System.out.println("Ori: " + Arrays.toString(arr));
			algorithm.sort(arr);
			System.out.printf("%s --> ascending sort: %s\n", algorithm.name(), Arrays.toString(arr));
			algorithm.sortDescending(arr);
			System.out.printf("%s --> descending sort: %s\n", algorithm.name(), Arrays.toString(arr));
		}
		
	}
}
