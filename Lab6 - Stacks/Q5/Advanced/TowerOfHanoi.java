package Lab6.Q5.Advanced;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public abstract class TowerOfHanoi {
	protected static final String RANGE = "abc";
	protected static final int MODE_DELAY = 1500;
	
	protected Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("unchecked")
	protected Stack<Integer>[] stacks = new Stack[3];
	protected int numOfDisc;
	
	public void initialize() {
		numOfDisc = getNumberOfDisc();
		
		for (int i = 0; i < stacks.length; i++) {
			stacks[i] = new Stack<Integer>();
		}

		for (int i = numOfDisc; i > 0; i--) {
			stacks[0].push(i);
		}
	}
	
	public int makeMove(Stack<Integer> src, Stack<Integer> dst) {
		int disc = src.pop();
		dst.push(disc);
		return disc;
	}
	
	public boolean isValidMove(Stack<Integer> src, Stack<Integer> dst) {
		// If source is empty, nothing can be popped, thus return false;
		// If destination is empty, any value from source can be popped.
		// If both source and destination are not empty, 
		// thus the src.peek() should be smaller than dst.peek()
		return !src.isEmpty() && (dst.isEmpty() || src.peek() < dst.peek());
	}

	private String discImage(int numOfDisc, int size) {
		int disc = (size << 1) - 1;
		int space = numOfDisc - size;
		return String.format("%s%s%s", " ".repeat(space), "=".repeat(disc), " ".repeat(space));
	}

	private String rodImage(int numOfDisc) {
		int space = numOfDisc - 1;
		return String.format("%s|%s", " ".repeat(space), " ".repeat(space));
	}

	@SuppressWarnings("unchecked")
	public String towerImage(int numOfDisc, Stack<Integer>[] stacks) {
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
	
	public void printTower() {
		System.out.println(towerImage(numOfDisc, stacks));
	}
	
	private int getNumberOfDisc() {
		int numberOfDisc;
		while(true) {
			try {
				System.out.print("Enter number of disks: ");
				numberOfDisc = sc.nextInt();
				break;
			} catch(InputMismatchException ex) {
				System.out.println("Please enter an integer value.");
			} finally {
				sc.nextLine();
			}
		}
		return numberOfDisc;
	}
	
	protected void callModeDelay() {
		callDelay(MODE_DELAY);
	}
	
	protected void callDelay(int delay) {
		try {
			Thread.sleep(delay);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	abstract void play();
	
}
