package Lab6.Q5.Advanced;

import java.util.Stack;

public class UserPlay extends TowerOfHanoi {
	public void play() {
		initialize();
		printTower();
		
		while(!isFinished(stacks[2], numOfDisc)) {
			System.out.print("Enter the move (e.g: a c): ");
			String input = sc.nextLine();
			
			if(isValidCommand(input)) {
				int src = RANGE.indexOf(input.charAt(0));
				int dst = RANGE.indexOf(input.charAt(2));
				
				if(isValidMove(stacks[src], stacks[dst])) {
					makeMove(stacks[src], stacks[dst]);
					printTower();
				} else {
					System.out.printf("Invalid move: %s. %d at %c is larger than %d at %c\n\n", input, 
							stacks[src].peek(), (char) (src + 'a'),
							stacks[dst].peek(), (char) (dst + 'a'));
				}
				
			} else {
				System.out.println("Invalid command: " + input);
			}
		}
		
		System.out.println("Well done!\n");
		callModeDelay();
	}
	
	public boolean isFinished(Stack<Integer> dst, int numOfDisc) {
		return dst.size() == numOfDisc;
	}
	
	public boolean isValidCommand(String input) {
		return input.length() == 3 && isWithinRange(input.charAt(0)) && isWithinRange(input.charAt(2));
	}
	
	public boolean isWithinRange(char move) {
		return RANGE.indexOf(move) >= 0 && RANGE.indexOf(move) <= 2;
	}
}
