package T10Q2;

public class Main {
	public static void main(String[] args) {
		SortingAlgorithm algo;
		// Insertion sort repeatedly inserts an unsorted element into a sorted subarray
		algo = new InsertionSort();
		algo.run();
		
		// Selection sort repeatedly finds the smallest number in the list and put it from the left 
		algo = new SelectionSort();
		algo.run();
		
		// Bubble sort repeatedly compares successive neighboring pairs 
		// and swap them if a pair is in descending order
		algo = new BubbleSort();
		algo.run();
		
		// Merge sort repeatedly divides the array into two halves and merge them into sorted array
		algo = new MergeSort();
		algo.run();
	}
}

