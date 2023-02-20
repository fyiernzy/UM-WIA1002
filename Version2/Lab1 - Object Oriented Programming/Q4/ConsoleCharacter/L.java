package Lab1.Q4.ConsoleCharacter;

public class L extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 5;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 1);
		plotHorizontalLine(buff, 2, 5, ROW - 1);
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 4;	
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 1, ROW - 1, 1);
		plotHorizontalLine(buff, 1, 4, ROW - 1);
		return buff;
	}
}
