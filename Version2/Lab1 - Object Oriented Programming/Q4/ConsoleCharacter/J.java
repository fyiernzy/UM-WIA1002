package Lab1.Q4.ConsoleCharacter;

public class J extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 5;
		boolean[][] buff = getBuff(column + 2);
		plotHorizontalLine(buff, 1, 5, 0);
		plotHorizontalLine(buff, 2, 3, ROW - 1);
		plotVerticalLine(buff, 1, 3, 3);
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 2;	
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 2, ROW - 1, 2);
		buff[0][1] = buff[ROW - 1][1] = true;
		return buff;
	}
}
