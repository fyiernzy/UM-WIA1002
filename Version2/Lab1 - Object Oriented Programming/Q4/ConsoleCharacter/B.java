package Lab1.Q4.ConsoleCharacter;

public class B extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 1);
		plotDotsInColumn(buff, 2, new int[] {0, 2});
		plotDotsInColumn(buff, 3, new int[] {1, 3});
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLines(buff, 2, ROW - 1, new int[] {1, 3});
		buff[0][1] = buff[1][1] = buff[2][2] = buff[3][2] = true;
		return buff;
	}
}
