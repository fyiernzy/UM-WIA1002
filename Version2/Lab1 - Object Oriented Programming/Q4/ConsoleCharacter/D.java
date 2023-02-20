package Lab1.Q4.ConsoleCharacter;

public class D extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 1);
		plotVerticalLine(buff, 1, 3, 3);
		buff[0][2] = buff[4][2] = true;
		
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 3);
		plotVerticalLine(buff, 2, 4, 1);
		buff[2][2] = buff[4][2] = true;
		return buff;
	}
}
