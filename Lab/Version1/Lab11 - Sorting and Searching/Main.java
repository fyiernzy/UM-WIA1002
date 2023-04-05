package Lab10;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		int[] arr ;
		
		arr = new int[] {45, 7, 2, 8, 19, 3};
		main.selectionSortSmallest(arr);
		System.out.println("Selection sort ascending: " + Arrays.toString(arr));
		
		arr = new int[] {45, 7, 2, 8, 19, 3};
		main.selectionSortLargest(arr);
		System.out.println("Selection sort descending: " + Arrays.toString(arr));
		
		arr = new int[] {10, 34, 2, 56, 7, 67, 88, 42};
		main.insertionSort(arr);
		System.out.println("Insertion sort ascending: " + Arrays.toString(arr));
		
	}
	
	// Q1
	public void selectionSortSmallest(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[smallest])
					smallest = j;
			}
			
			int tmp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = tmp;
		}
	}
	
	
	// Q2
	public void selectionSortLargest(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int largest = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] > arr[largest])
					largest = j;
			}
			
			int tmp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = tmp; 
		}
	}
	
	// Q3
	public void insertionSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int j = i - 1;
			int key = arr[i];
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			
//			int j;
//            for (j = i-1; j >= 0 && key < arr[j]; j--)
//                arr[j+1] = arr[j];
			
			// Because j now is -1
			arr[j + 1] = key;
		}
	}
}
