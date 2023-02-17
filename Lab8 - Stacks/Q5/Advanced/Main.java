package Lab8.Q5.Advanced;

import java.util.Scanner;

public class Main {
	static boolean isStepwise = false;
	static boolean isComment = false;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Outer: 
		while(true) {
			printIntro();
			
			while(true) {
				System.out.print("Your command >>> ");
				String ans = scanner.nextLine();
				
				if(ans.toLowerCase().startsWith("q"))
					break Outer;
				
				if(ans.equals("stepwise")) {
					isStepwise = !isStepwise;
					System.out.println("Stepwise mode " + ((isStepwise) ? "On" : "Off"));
					continue;
				}
				
				if(ans.equals("comment")) {
					isComment = !isComment;
					System.out.println("Comment mode " + ((isComment) ? "On" : "Off"));
					continue;
				}
				
				if(isValidInput(ans)) {
					int choice = Integer.parseInt(ans);
					TowerOfHanoi mode = getMode(choice);
					mode.play();
					break;
				} else {
					System.out.printf("Invalid input: %s. Please enter an integer value between 1 and 4.\n", ans);
				}
			}
		}
	}
	
	public static TowerOfHanoi getMode(int choice) {
		switch(choice) {
		case 1: return new UserPlay();
		case 2: return new AI_Binary(isStepwise, isComment);
		case 3: return new AI_Iterative(isStepwise, isComment);
		case 4: return new AI_Recursion(isStepwise, isComment);
		default: throw new IllegalStateException();
		}
	}
	
	public static void printIntro() {
		System.out.printf(" Main modes:\n"
				+ "   1. %-18s: Play around with ToH with interactive console.\n"
				+ "   2. %-18s: Using binary solution to show steps of solving ToH.\n"
				+ "   3. %-18s: Using iterative solution to show steps of solving ToH.\n"
				+ "   4. %-18s: Using recursion solution to show steps of solving ToH.\n"
				+ " Other modes:\n"
				+ "   1. %-18s: Allow user to play the steps manually.\n"
				+ "   2. %-18s: Display each movement in text.\n"
				+ " Remarks:\n"
				+ "   1. ToH stands for Tower of Hanoi.\n"
				+ "   2. Enter quit/q to quit.\n"
				+ "   3. Enter stepwise to toggle the stepwise mode for AI. Stepwide mode = %s.\n"
				+ "   4. Enter comment to toggle the comment mode for AI. Comment mode = %s.\n\n",
				"UserPlay mode", "AI_Binary mode", "AI_Iterative mode", "AI_Recursion mode", 
				"Stepwise mode", "Comment mode",
				(isStepwise) ? "On" : "Off", (isComment) ? "On" : "Off");
	}
	
	public static boolean isValidInput(String input) {
		return input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '4';
	}
	
}
