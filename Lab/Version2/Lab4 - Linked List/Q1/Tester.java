package Lab4.Q1;

import java.util.Random;
public class Tester {
	public static void main(String[] args) {
		int[] arr = new Random().ints(10, 0, 100).toArray();
		System.out.println("The random numbers are : " );
		for(int i : arr) 
			System.out.print(i + " ");
		System.out.println();
		
		LinkedList<Integer> list = new LinkedList<>();

		System.out.println("Insert the random numbers at the back of the linked list");
		for(int i : arr) {
			list.addLast(i);
		}
			
		System.out.println(list.toString());
		
		list.clear();
		
		System.out.println("Insert the random numbers in the front of the linked list");
		for(int i : arr) 
			list.addFirst(i);
		System.out.println(list.toString());
		
		list.clear();
		
		System.out.println("Insert the random numbers in a sorted linked list");
		for(int i : arr)
			list.addSortNode(i);
		System.out.println(list.toString());
		
	}
}
