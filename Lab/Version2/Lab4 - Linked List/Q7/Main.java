package Lab4.Q7;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String[] arr = scanner.nextLine().split(" ");
		scanner.close();
		
		CircularLinkedList<String> list = new CircularLinkedList<>();
		for(String word : arr)
			list.addCircularNode(word);
		
		System.out.println("The words in the circular linked list");
		list.displayCircularList();
		
		System.out.println("After delete a word");
		list.deleteCircularNode();
		list.displayCircularList();
		
		System.out.println("The second item in the list is '" + list.getCircularItem(1) + "'");
	}
}
