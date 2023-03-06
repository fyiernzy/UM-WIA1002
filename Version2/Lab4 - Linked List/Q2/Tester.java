package Lab4.Q2;

import java.util.List;

public class Tester {
	public static void main(String[] args) {
		char[] arr = "Banking".toCharArray();
		LinkedList<Character> list = new LinkedList<>();
		for(char ch : arr)
			list.add(ch);
		System.out.println("The original list : " + list.toString());
		
		System.out.println("Split the list into two");
		List<LinkedList<Character>> list1 = list.splitList();
		System.out.println(list1.get(0).toString());
		System.out.println(list1.get(1).toString());
		
		System.out.println("Split the list by alternating the nodes");
		List<LinkedList<Character>> list2 = list.alternateList();
		System.out.println(list2.get(0).toString());
		System.out.println(list2.get(1).toString());
		
		System.out.println("Merge the First List and Second List by by alternating the nodes");
		LinkedList<Character> list3 = list.mergeList(list2.get(0), list2.get(1));
		System.out.println(list3.toString());
		
		System.out.println("Reverse the list. Recursive method in the LinkedList");
		list.reverse();
		System.out.println(list.toString());
		
		System.out.println("Reverse the list. Recursive method in the tester class");
		reverse(list);
		System.out.println(list.toString());
		
		
		
	}
	
	public static void reverse(LinkedList<Character> list) {
		list.reverse();
	}
	
	
}
