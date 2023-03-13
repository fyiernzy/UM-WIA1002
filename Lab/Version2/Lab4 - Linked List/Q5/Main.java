package Lab4.Q5;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("ARS");
		list.add("CHE");
		list.add("LEI");
		list.add("MAN");
		list.add("LIV");
		list.add("TOT");
		
		System.out.println("The list consists of " + list);
		
		System.out.println("Remove all the word that consists of the A character using iterator.");
		Iterator<String> ltr = list.iterator();
		while(ltr.hasNext()) {
			String str = ltr.next();
			if(str.contains("A"))
				ltr.remove();
		}
		
		System.out.println("The updated list consists of " + list);
	}
} 
