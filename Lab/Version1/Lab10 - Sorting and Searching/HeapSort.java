package Lab10;

public class HeapSort {
	public void sort(int[] arr) {
		int n = arr.length;
		
		// Build max heap
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		// Remove element
		for(int i = n - 1; i >= 0; i--) {
			swap(arr, i, 0);
			heapify(arr, i, 0);
		}
	}
	private void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if(left < n && arr[left] > arr[largest])
			largest = left;
		
		if(right < n && arr[right] > arr[largest])
			largest = right;
		
		if(largest != i) {
			swap(arr, i, largest);
			heapify(arr, n, largest);
		}
	}
	
	private void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
}
