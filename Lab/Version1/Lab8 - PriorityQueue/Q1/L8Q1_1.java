package Lab8.Q1;

import java.util.Arrays;
import java.util.Comparator;

import Lab8.Q1.QueueUtils.PriorityQueue;

public class L8Q1_1 {
	private static final int SIZE = 45;
	
	public static void main(String[] args) {
		int[] a = {4, 8, 1, 2, 9, 6, 3, 7};
		var pq = new PriorityQueue<Integer>();
		
		for(int i : a) pq.add(i);
		
		printMessage("PriorityQueue", pq.toString());
		printMessage("Poll element", pq.poll());
		
		pq.add(5);
		printMessage("PriorityQueue", pq.toString());
		
		Integer[] arr = pq.toArray(new Integer[pq.size()]);
		printMessage("To Array", Arrays.toString(arr));
		
		printMessage("Peek element", pq.peek());
		printMessage("Contains element 1", pq.contains(1));
		
		printMessage("Size of priority queue", pq.size());
		
		StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) sb.append(pq.poll()).append(' ');
        printMessage("Removing elements from the priority queue", sb.toString());
		printMessage("Is priority queue empty", pq.isEmpty());
		
		pq = new PriorityQueue<Integer>(new ReverseComparator());
		for(Integer i : arr) pq.add(i);
		printMessage("Reverse order", pq.toString());
	}
	
	public static void printMessage(String label, Object val) {
		System.out.println(String.format(" %-" + SIZE + "s : %s", label, val));
	}
}

class ReverseComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		return -1 * Integer.compare(i1, i2);
	}
}
