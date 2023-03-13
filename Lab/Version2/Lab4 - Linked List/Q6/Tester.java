package Lab4.Q6;

import java.util.Iterator;
import java.util.Random;

public class Tester {
	public static void main(String[] args) {
		int[] arr = new Random().ints(10, 0, 100).toArray();
		DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

		System.out.println("The random numbers are : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		System.out.println("Insert the random numers into the doubly linked list");
		for (int i : arr)
			list.add(i);
		System.out.println(list);

		// a. Remove a random number from third position
		System.out.println("Remove a random number from third position");
		list.remove((int) 2);
		System.out.println(list);

		// b. Replace the number in seventh position with 999
		System.out.println("Replace the number in seventh position with 999");
		list.set(6, 999);
		System.out.println(list);

		// c. Remove all even number from the doubly linked list
		System.out.println("Remove all even number from the doubly linked list");
		Iterator<Integer> ltr = list.iterator();
		while (ltr.hasNext()) {
			int i = ltr.next();
			if (i % 2 == 0)
				ltr.remove();

		}
		System.out.println(list);

	}
}
