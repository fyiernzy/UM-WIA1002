package Lab1.Q4.ConsoleCharacter;

public class M extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 5;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLines(buff, 0, ROW - 1, new int[] {1, 5});
		plotDiagonalLeftTop(buff, 0, 2);
		plotDiagonalRightTop(buff, 0, 2);
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 5;	
		boolean[][] buff = getBuff(column + 2);
		plotHorizontalLine(buff, 1, 5, 2);
		plotVerticalLines(buff, 2, ROW - 1, new int[] {1, 3, 5});
		return buff;
	}
}
