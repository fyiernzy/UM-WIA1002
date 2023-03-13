package Lab2.Q3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class UNOGame {
	private Set<Integer> set; 
	
	public void newGame() {
		if(set == null) 
			set = new HashSet<>();
		else
			set.clear();
	}
	
	public UNOCard[] drawArray(int num) {
		if(num > 48 - set.size())
			return null;
		
		UNOCard[] cards = new UNOCard[num];
		for(int i = 0; i < num; ) {
			int val = (int)(Math.random() * 48);
			if(set.add(val))
				cards[i++] = new UNOCard(UNOCard.COLOR[val / 12], UNOCard.TYPE[val % 12]);
		}
		return cards;
	}
	
	public LinkedList<UNOCard> drawLinkedList(int num) {
		if(num > 48 - set.size())
			return null;
		
		LinkedList<UNOCard> cards = new LinkedList<>();
		while(cards.size() < num) {
			int val = (int)(Math.random() * 48);
			if(set.add(val)) 
				cards.add(new UNOCard(UNOCard.COLOR[val / 12], UNOCard.TYPE[val % 12]));
		}
		return cards;
	}
	
}
