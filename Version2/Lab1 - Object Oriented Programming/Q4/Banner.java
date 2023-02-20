package Lab1.Q4;

import Lab1.Q4.ConsoleCharacter.*;
import org.apache.commons.lang3.*;

public class Banner {
	private static final ConsoleCharacter[] COLLECTIONS = new ConsoleCharacter[] {
			new A(), new B(), new C(), new D(), new E(), new F(), new G(), new H(),
			new I(), new J(), new K(), new L(), new M()
	};
	
	public void print(String message) {
		if(isValidMessage(message)) {
			boolean[][] banner = new boolean[5][];
			
			for(int i = 0; i < message.length(); i++) {
				char ch = message.charAt(i);
				ConsoleCharacter character = COLLECTIONS[getPos(ch)];
				combine(banner, Character.isUpperCase(ch) ? character.getUppercase() : character.getLowercase());
			}
			
			print(banner);
		}
	}
	
	private void print(boolean[][] banner) {
		for (int i = 0; i < banner.length; i++) {
			for (int j = 0; j < banner[i].length; j++)
				System.out.print(banner[i][j] ? "*" : " ");
			System.out.println();
		}
	}
	
	private boolean isValidMessage(String str) {
		if(str.isEmpty()) return false;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!(Character.isLetter(ch) || Character.isWhitespace(ch))) 
				return false;
		}
		
		return true;
	}
	
	private int getPos(char ch) {
		return ((int) ch - 65) % 32;
	}
	
	private void combine(boolean[][] banner, boolean[][] charMatrix) {
		for(int i = 0; i < charMatrix.length; i++) 
			banner[i] = ArrayUtils.addAll(banner[i], charMatrix[i]);
	}
	
}
