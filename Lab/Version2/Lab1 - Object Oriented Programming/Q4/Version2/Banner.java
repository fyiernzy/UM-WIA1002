package Lab1.Q4.V2;

import Lab1.Q4.V2.ConsoleCharacter.*;
import org.apache.commons.lang3.*;

public class Banner {
	private static final ConsoleCharacter[] COLLECTIONS = new ConsoleCharacter[] {
			new A(), new B(), new C(), new D(), new E(), new F(), new G(), new H(),
			new I(), new J(), new K(), new L(), new M(), new N(), new O(), new P(), 
			new Q(), new R(), new S(), new T(), new U(), new V(), new W(), new X(),
			new Y(), new Z(), new Space()};
	
	public void print(String message) {
		if(isValidMessage(message)) {
			char[][] board = new char[5][];
			char[] chars = message.toCharArray();
			
			for(char ch : chars) {
				if(Character.isLetter(ch))
					combine(board, COLLECTIONS[getPos(ch)].getCharacter());
				else
					combine(board, COLLECTIONS[26].getCharacter());
			}
			
			print(board);
		}
	}
	
	private void print(char[][] board) {
		for(char[] line : board) {
			for(char ch : line)
				System.out.print(ch);
			System.out.println();
		}
	}
	
	private boolean isValidMessage(String message) {
		for(char ch : message.toCharArray()) 
			if(!Character.isLetter(ch) && !Character.isWhitespace(ch))
				return false;
		return true;
	}
	
	private int getPos(char ch) {
		return ((int) ch - 65) % 32;
	}
	
	private void combine(char[][] board, char[][] character) {
		int N = character.length;
		for(int i = 0; i < N; i++) 
			board[i] = ArrayUtils.addAll(board[i], character[i]);
	}
}
