package Lab2.Q3;

import java.util.LinkedList;

public class Tester {
	public static void main(String[] args) {
		UNOGame game = new UNOGame();
		int times = 7;
		
		game.newGame();
		System.out.println("Array Implementation");
		System.out.printf("Player 1 draws %d times\n", times);
		UNOCard[] card1 = game.drawArray(7);
		for(UNOCard card : card1)
			System.out.print(card + " :: ");
		System.out.println();
		
		System.out.println("Array Implementation");
		System.out.printf("Player 2 draws %d times\n", times);
		UNOCard[] card2 = game.drawArray(7);
		for(UNOCard card : card2)
			System.out.print(card + " :: ");
		System.out.println();
		
		System.out.println();
		
		game.newGame();
		System.out.println("LinkedList Implementation");
		System.out.printf("Player 1 draws %d times\n", times);
		LinkedList<UNOCard> card3 = game.drawLinkedList(7);
		for(UNOCard card : card3)
			System.out.print(card + " :: ");
		System.out.println();
		
		System.out.println("LinkedList Implementation");
		System.out.printf("Player 2 draws %d times\n", times);
		LinkedList<UNOCard> card4 = game.drawLinkedList(7);
		for(UNOCard card : card4)
			System.out.print(card + " :: ");
		System.out.println();
		
	}
	
	
}
