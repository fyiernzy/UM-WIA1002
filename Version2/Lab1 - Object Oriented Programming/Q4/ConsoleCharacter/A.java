package Lab1.Q4.ConsoleCharacter;

public class A extends ConsoleCharacter {

	public boolean[][] getUppercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		plotDotsInColumn(buff, 2, new int[] {0, 2});
		plotVerticalLines(buff, 1, ROW - 1, new int[] {1, 3});
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 4);
		plotDotsInRow(buff, 0, new int[] {2, 3});
		plotDotsInRow(buff, 1, new int[] {1, 4});
		plotDotsInRow(buff, 2, new int[] {1, 4});
		plotDotsInRow(buff, 3, new int[] {2, 3});

		return buff;
	}
	
}
