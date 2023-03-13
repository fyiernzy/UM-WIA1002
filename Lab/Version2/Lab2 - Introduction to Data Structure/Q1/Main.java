package Lab2.Q1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		final int N = 20;
		System.out.printf("Generate %d non-duplicate integer within 0-100\n", N);
		System.out.println("LinkedList Implementation");
		NonDuplicate<ArrayList<Integer>> non1 = new NonDuplicate<>(new ArrayList<>());
		ArrayList<Integer> list1 = non1.implement(20);
		list1.forEach(val -> System.out.print(val + " "));
		
		System.out.println();
		
		System.out.println("Array Implementation");
		NonDuplicate<LinkedList<Integer>> non2 = new NonDuplicate<>(new LinkedList<>());
		LinkedList<Integer> list2 = non2.implement(20);
		list2.forEach(val -> System.out.print(val + " "));
	}
}
