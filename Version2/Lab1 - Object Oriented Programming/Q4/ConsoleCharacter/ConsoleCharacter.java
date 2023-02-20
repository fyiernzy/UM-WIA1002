package Lab1.Q4.ConsoleCharacter;

public abstract class ConsoleCharacter {
	protected static final int ROW = 5;
	
	protected boolean[][] getBuff(int column) {
		boolean[][] buff = new boolean[ROW][];
		for(int i = 0; i < ROW; i++) {
			buff[i] = new boolean[column];
		}
		return buff;
	}
	
	protected void plotVerticalLine(boolean[][] buff, int column, int startRow, int endRow) {
		for(int i = startRow; i <= endRow; i++) {
			buff[i][column] = true;
		}
	}
	
	abstract boolean[][] getUppercase();
	abstract boolean[][] getLowercase();
	
	
}
