package Lab6.Q5.Elementary;

import java.util.Scanner;

public class Recursion {
	public static int DELAY = 1500;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of disc(s): ");
		int numOfDisc = sc.nextInt();
		sc.close();
		
		IntStack[] stacks = initialize(numOfDisc);
		TowerOfHanoi.display(numOfDisc, stacks);
		wait(DELAY);
		hanoi(numOfDisc, numOfDisc, stacks, 0, 2, 1);
	}
	
	public static IntStack[] initialize(int numOfDisc) {
		IntStack[] stacks = new IntStack[3];
		
		for(int i = 0; i < stacks.length; i++) {
			stacks[i] = new IntStack();
		}
		
		for(int i = numOfDisc; i > 0; i--) {
			stacks[0].push(i);
		}
		
		return stacks;
	}
	
	public static void hanoi(int numOfDisc, int disc, IntStack[] stacks, int src, int dst, int mid) {
		if(disc > 0) {
			hanoi(numOfDisc, disc - 1, stacks, src, mid, dst);
			makeMove(stacks[src], stacks[dst]);
			TowerOfHanoi.display(numOfDisc, stacks);
			wait(DELAY);
			hanoi(numOfDisc, disc - 1, stacks, mid, dst, src);
		}
	}
	
	public static void makeMove(IntStack src, IntStack dst) {
		dst.push(src.pop());
	}
	
	public static void wait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch(InterruptedException ex) {
			
		}
	}
}
