package Lab10;

import java.util.Arrays;

public class MergeSort2 {
	private static void merge(int[] arr, int from, int mid, int to) {
		int n1 = mid - from + 1;
		int n2 = to - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		// Initialize two arrays named left and right
		for (int i = 0; i < n1; i++) {
			left[i] = arr[i + from];
		}

		for (int i = 0; i < n2; i++)
			right[i] = arr[i + mid + 1];

		int i = 0, j = 0, k = from;

		while (i < n1 && j < n2) {
			if (left[i] < right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}

		while (i < n1)
			arr[k++] = left[i++];

		while (j < n2)
			arr[k++] = right[j++];

	}

	public static void mergeSort(int[] arr) {
		int n = arr.length;
		for (int size = 1; size < n; size = size << 1) {
			for (int from = 0; from < n; from += 2 * size) {
				int mid = Math.min(from + size - 1, n - 1);
				int to = Math.min(from + 2 * size - 1, n - 1);
				merge(arr, from, mid, to);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 0, 3, 4 };
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
