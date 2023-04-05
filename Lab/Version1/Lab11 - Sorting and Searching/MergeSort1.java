package Lab10;

import java.util.Arrays;

public class MergeSort1 {
	void merge(int[] arr, int[] left, int[] right) {
		// Initialize three pointers
		int k = 0, i = 0, j = 0;
		
		// Merge the array
		while(i < left.length && j < right.length) {
			if(left[i] < right[j])
				arr[k++] = left[i++];
			else 
				arr[k++] = right[j++];
		}
		
		// When we run out of elements in either left or right,
	    // pick up the remaining elements and put in arr[]
		while(i < left.length)
			arr[k++] = left[i++];
		
		while(j < right.length)
			arr[k++] = right[j++];
	}
	
	public void mergeSort(int[] arr) {
		if(arr.length > 1) {
			int N = arr.length;
			int[] left = new int[N / 2];
			int[] right = new int[N - N / 2];
			System.arraycopy(arr, 0, left, 0, N / 2);
			System.arraycopy(arr, N / 2, right, 0, N - N / 2);
			mergeSort(left); // new array
			mergeSort(right); // new array
			merge(arr, left, right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 11, 13, 5, 6, 7 };
		new MergeSort1().mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
