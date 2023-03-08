package Lab1.Q4.V2.ConsoleCharacter;

public abstract class ConsoleCharacter {
	protected final static int DEFAULT_HEIGHT = 5;
	protected final static int DEFAULT_SPACE = 1;
	protected char[][] character;
	protected String ascii;

	private void initialize() {
		initialize(1);
	}
	
	private void initialize(int space) {
		String[] lines = ascii.split("\n");
		int size = lines[0].length();
		this.character = new char[DEFAULT_HEIGHT][size + space * 2];
		for(int i = 0; i < DEFAULT_HEIGHT; i++) 
			System.arraycopy(lines[i].toCharArray(), 0, character[i], 1, size);
	}

	public char[][] getCharacter() {
		if (character == null)
			initialize();
		return character;
	}
}
