package Lab8.Q1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

public class L8Q1_2 {
	/* Modified from LimJY */
	/* https://github.com/LimJY03/WIA1002_UM/blob/main/Lab_08/L8Q1.java */
	
	private static final int SIZE = 45;
	
	public static void main(String[] args) {
		Integer[] arr = {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue<Integer> pq;
        
        pq = new PriorityQueue<>(Arrays.asList(arr));
        
        // Displaying all the elements in the priority queue z
        printMessage("Elements in the priority queue", pq.toString());

        // Retrieving and removing the first element in the priority queue
        printMessage("First element retrieved and removed", pq.poll());

        // Adding new element 5 into the priority queue
        pq.add(5);
        printMessage("Elements in the priority queue", pq.toString());

        // Converting the priority queue into an array and displaying
        printMessage("Priority queue converted to an array", Arrays.toString(pq.toArray()));

        // Retrieving the first element in the priority queue
        printMessage("First element retrieved (without removing)", pq.peek());

        // Checking if the priority queue consists of element "1"
        printMessage("Priority queue contains element \"1\"", pq.contains(1));

        // Getting the current size of the priority queue
        printMessage("Current size of the priority queue", pq.size());

        // Displaying and removing all elements in the priority queue
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) sb.append(pq.poll()).append(' ');
        printMessage("Removing elements from the priority queue", sb.toString());

        // Sorting the priority queue in reverse order
        pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int num: arr) pq.add(num);
        printMessage("Priority queue sorted in reverse order", pq.toString());
	}
	
	public static void printMessage(String label, Object val) {
		System.out.println(String.format(" %-" + SIZE + "s : %s", label, val));
	}
}
