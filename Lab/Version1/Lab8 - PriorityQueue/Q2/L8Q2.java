package Lab8.Q2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class L8Q2 {
	private static final int SIZE = 25;
	public static void main(String[] args) {
		var pq1 = new PriorityQueue<String>(Arrays.asList(
				"George", "Jim", "John", "Blake", "Kevin", "Michael"));
		var pq2 = new PriorityQueue<String>(Arrays.asList(
				"George", "Katie", "Kevin", "Michelle", "Ryan"));
		
		System.out.println(message("PriorityQueue 1", pq1.toString()));
		System.out.println(message("PriorityQueue 2", pq2.toString()));
		
		var union = new PriorityQueue<String>(pq1);
		union.addAll(pq2);
		System.out.println(message("Union", union.toString()));
		
		var diff1 = new PriorityQueue<String>(pq1);
		diff1.removeAll(pq2);
		System.out.println(message("Difference (pq1 - pq2)", diff1.toString()));
		
		var diff2 = new PriorityQueue<String>(pq2);
		diff2.removeAll(pq1);
		System.out.println(message("Difference (pq2 - pq1)", diff2.toString()));
		
		var ints = new PriorityQueue<String>(pq1);
		ints.retainAll(pq2);
		System.out.println(message("Intersection", ints.toString()));
	}
	
	public static String message(String label, String val) {
		return String.format(" %-" + SIZE + "s : %s", label, val);
	}
}
