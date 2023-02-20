package Lab1.Q4.ConsoleCharacter;

public class C extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 1);
		plotHorizontalLines(buff, 2, 4, new int[] {2, 4});
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 2, ROW - 1, 1);
		plotHorizontalLines(buff, 2, 3, new int[] {2, 4});
		return buff;
	}
}
