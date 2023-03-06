package Lab4.Q4;

import java.util.Iterator;
import java.util.LinkedList;

public class StarList {
	private static final char STAR = '*';
	
	public static void main(String[] args) {
		var playerOne = new LinkedList<Character>();
		var playerTwo = new LinkedList<Character>();
		boolean isOneTurn = (int)(Math.random() * 2) == 1 ? true : false;
		
		System.out.println("Player " + (isOneTurn ? 1 : 2) + " start first");
		
		while(Math.max(playerOne.size(), playerTwo.size()) <= 20) {
			if(isOneTurn) {
				rollDice(playerOne);
				System.out.print("Player 1: ");
				printList(playerOne);
			} else {
				rollDice(playerTwo);
				System.out.print("Player 2: ");
				printList(playerTwo);
			}
			
			isOneTurn = !isOneTurn;
		}
		
		System.out.println("Player " + (playerOne.size() > 20 ? 1 : 2) + " wins the game");
	}
	
	public static void rollDice(LinkedList<Character> list) {
		int n = (int)(Math.random() * 6 + 1);
		for(int i = 0; i < n; i++) 
			list.add(STAR);
	}
	
	public static void printList(LinkedList<Character> list) {
		Iterator<Character> ltr = list.iterator();
		while(ltr.hasNext()) 
			System.out.print(ltr.next() + " --> ");
		System.out.println();
	}
}
