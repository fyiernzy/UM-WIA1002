package Lab3;

import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int[] arr = new Random().ints(sc.nextInt(), 0, 9).toArray();
		sc.close();
		
		System.out.println(Arrays.toString(arr));
		permute(arr);
		
	}

	public static void permute(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		permute(arr, 0, set);
	}
	
	public static void permute(int[] arr, int perm, Set<Integer> set) {
		if(arr.length == 0) {
			if(set.add(perm))
				System.out.println(perm);
		} else {
			for(int i = 0; i < arr.length; i++) {
				permute(getElementArray(arr, i), perm * 10 + arr[i], set);
			}
		}
	}
	
	// This method is used to get the elements left
	private static int[] getElementArray(int[] arr, int x) {
		int n = arr.length, p = 0;
		int[] newArray = new int[n - 1];
		for(int i = 0; i < arr.length; i++) 
			if(i != x) 
				newArray[p++] = arr[i];
		return newArray;
	}
}
