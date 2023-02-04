package Lab5;

public class ArrayBagDemo {
	public static void main(String[] args) {
		ArrayBag<String> bag1 = new ArrayBag<String>();
		ArrayBag<String> bag2 = new ArrayBag<String>();
		
		String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
		String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
		
		System.out.printf("bag1:\nAdding %s\n", String.join(" ", contentsOfBag1));
		testAdd(bag1, contentsOfBag1);
		displayBag(bag1);
		System.out.println("");
		
		System.out.printf("bag2:\nAdding %s\n", String.join(" ", contentsOfBag2));
		testAdd(bag2, contentsOfBag2);
		displayBag(bag2);
		System.out.println("");
		
		System.out.println("bag3, test the method union of bag1 and bag2");
		ArrayBag<String> bag3 = (ArrayBag<String>) bag1.union(bag2);
		displayBag(bag3);
		System.out.println("");
		
		System.out.println("bag4, test the method intersection of bag1 and bag2");
		ArrayBag<String> bag4 = (ArrayBag<String>) bag1.intersection(bag2);
		displayBag(bag4);
		System.out.println("");
		
		System.out.println("bag5, test the method difference of bag1 and bag2");
		ArrayBag<String> bag5 = (ArrayBag<String>) bag1.difference(bag2);
		displayBag(bag5);
		
	}
	
	private static void testAdd(BagInterface<String> aBag, String[] content) {
		for(String item : content) 
			aBag.add(item);	
	}
	
	private static void displayBag(BagInterface<String> aBag) {
		Object[] content = aBag.toArray();
		System.out.printf("The bag contains %d string(s), as follows:\n", content.length);
		for(int i = 0; i < content.length; i++) 
			System.out.print(content[i] + ((i == content.length - 1) ? "\n" : " "));
	}
}
