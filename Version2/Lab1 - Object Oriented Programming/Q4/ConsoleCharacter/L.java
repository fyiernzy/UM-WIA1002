package Lab1.Q4.ConsoleCharacter;

public class L extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 1);
		plotHorizontalLine(buff, 2, 3, ROW - 1);
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 2;	
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 2, ROW - 1, 1);
		buff[ROW - 1][2] = true;
		return buff;
	}
}
