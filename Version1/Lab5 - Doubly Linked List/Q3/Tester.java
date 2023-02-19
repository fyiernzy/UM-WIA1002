package Lab5.Q3;

public class Tester {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		for(int i = 1; i <= 100; i *= 10) {
			System.out.println("adding: " + i);
			list.addLast(i);
		}
		System.out.println("adding: 2");
		list.add(2, 2);
		System.out.println("deleted: " + list.remove(3));
		
		System.out.println("\niterating forward..");
		list.iterateForward();
		System.out.println("\niterating backward..");
		list.iterateBackward();
		
		int size = list.getSize();
		System.out.println("size of current Doubly Linked List: " + size);
		list.clear();
		System.out.println("Successfully clear 3 node(s)");
		
		System.out.println("\nsize of current Doubly Linked List: " + list.getSize());
		
	}
}
