package Lab6.Q5.Elementary;

import java.util.Scanner;

public class Iterative {
	public static final int DELAY = 1500;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of disc(s): ");
		int numOfDisc = sc.nextInt();
		sc.close();
		
		IntStack[] stacks = initialize(numOfDisc);
		TowerOfHanoi.display(numOfDisc, stacks);
		wait(DELAY);
		hanoi(numOfDisc, stacks);
	}
	
	public static void hanoi(int numOfDisc, IntStack[] stacks) {		
		int[][] odd = {{0, 2}, {0, 1}, {1, 2}};
		int[][] even = {{0, 1}, {0, 2}, {1, 2}};
		int[][] move = (numOfDisc % 2 == 0) ? even : odd;
		
		IntStack dst = stacks[2];
		
		while(!isFinished(dst, numOfDisc)) {
			for(int[] loc : move) {
				makeMove(stacks[loc[0]], stacks[loc[1]]);
				TowerOfHanoi.display(numOfDisc, stacks);
				
				if(isFinished(dst, numOfDisc))
					break;
				
				wait(DELAY);
			}
		}
	}
	
	public static void makeMove(IntStack src, IntStack dst) {
		if(isValidMove(src, dst))
			dst.push(src.pop());
		else 
			src.push(dst.pop());
	}
	
	public static boolean isValidMove(IntStack src, IntStack dst) {
		return !src.isEmpty() && (dst.isEmpty() || src.peek() < dst.peek());
	}
	
	public static boolean isFinished(IntStack dst, int numOfDisc) {
		return dst.size() == numOfDisc;
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
	
	public static void wait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch(InterruptedException ex) {
			
		}
	}
}
