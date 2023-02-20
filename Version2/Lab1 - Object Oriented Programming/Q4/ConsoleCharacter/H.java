package Lab1.Q4.ConsoleCharacter;

public class H extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLines(buff, 0, ROW - 1, new int[] {1, 2});
		plotHorizontalLine(buff, 2, 3, 2);
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 3;	
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 1);
		plotVerticalLine(buff, 2, ROW - 1, 3);
		buff[2][2] = true;
		return buff;
	}
}
