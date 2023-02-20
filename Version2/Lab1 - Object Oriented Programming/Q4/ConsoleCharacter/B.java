package Lab1.Q4.ConsoleCharacter;

public class B extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		
		for (int i = 0; i < ConsoleCharacter.ROW; i++) 
			buff[i][1] = true;
		
		buff[0][2] = buff[2][2] = buff[4][2] = true;
		buff[1][3] = buff[3][3] = true;

		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);

		for (int i = 2; i < ConsoleCharacter.ROW; i++) 
			buff[i][1] = buff[i][3] = true;
		
		buff[0][1] = buff[1][1] = buff[2][2] = buff[3][2] = true;
		return buff;
	}
}
