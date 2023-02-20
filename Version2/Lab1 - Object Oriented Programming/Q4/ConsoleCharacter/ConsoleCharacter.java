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
	
	/**
	 * @param buff the buffer to be plotted
	 * @param column the column that should be plotted
	 * @param startRow the row that plotting should start
	 * @param endRow the row that plotting should end. Inclusive.
	 */
	protected void plotVerticalLine(boolean[][] buff, int startRow, int endRow, int column) {
		for(int i = startRow; i <= endRow; i++) 
			buff[i][column] = true;
	}
	
	protected void plotVerticalLines(boolean[][] buff, int startRow, int endRow, int... columns) {
		for(int column : columns)
			plotHorizontalLine(buff, startRow, endRow, column);
	}
	
	protected void plotHorizontalLine(boolean[][] buff, int startColumn, int endColumn, int row) {
		for(int i = startColumn; i <= endColumn; i++) 
			buff[row][i] = true;
	}
	
	protected void plotHorizontalLines(boolean[][] buff, int startColumn, int endColumn, int... rows) {
		for(int row : rows)
			plotHorizontalLine(buff, startColumn, endColumn, row);
	}
	
	protected void plotDotsInRow(boolean[][] buff, int row, int... dotColumns) {
		for(int dotColumn : dotColumns)
			buff[row][dotColumn] = true;
	}
	
	protected void plotDotsInColumn(boolean[][] buff, int column, int... dotRows) {
		for(int dotRow : dotRows)
			buff[dotRow][column] = true;
	}
	
	abstract boolean[][] getUppercase();
	abstract boolean[][] getLowercase();
	
	
}
