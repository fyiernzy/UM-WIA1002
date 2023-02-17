package Lab8.Q5.Elementary;

import java.util.Iterator;

public class TowerOfHanoi {
	public static String RANGE = "abc";
	
	public static void display(int numOfDisc, IntStack[] stacks) {
		System.out.println(towerImage(numOfDisc, stacks));
	}
	
	private static String discImage(int numOfDisc, int size) {
		int disc = (size << 1) - 1;
		int space = numOfDisc - size;
		return String.format("%s%s%s", " ".repeat(space), "=".repeat(disc), " ".repeat(space));
	}

	private static String rodImage(int numOfDisc) {
		int space = numOfDisc - 1;
		return String.format("%s|%s", " ".repeat(space), " ".repeat(space));
	}
	
	@SuppressWarnings("unchecked")
	private static String towerImage(int numOfDisc, IntStack[] stacks) {
		Iterator<Integer>[] iterators = new Iterator[3];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < iterators.length; i++) {
			iterators[i] = stacks[i].iterator();
		}

		// Print out the rod image
		for (int i = 0; i <= numOfDisc; i++) {
			StringBuilder line = new StringBuilder();
			for (Iterator<Integer> iterator : iterators) {
				if (iterator.hasNext())
					line.append(" ").append(discImage(numOfDisc, iterator.next())).append(" ");
				else
					line.append(" ").append(rodImage(numOfDisc)).append(" ");
			}
			line.append("\n");
			sb.insert(0, line);
		}

		sb.insert(0, "\n");

		// Print out the alphabet label
		for (int i = 0; i <= 2; i++) {
			sb.append(String.format("%s%s%s", " ".repeat(numOfDisc), RANGE.charAt(i), " ".repeat(numOfDisc)));
		}

		return sb.toString();
	}
	
}
