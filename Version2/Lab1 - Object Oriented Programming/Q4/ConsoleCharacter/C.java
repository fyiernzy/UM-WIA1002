package Lab1.Q4.ConsoleCharacter;

public class C extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);
		
		for (int i = 0; i < ConsoleCharacter.ROW; i++) 
			buff[i][1] = true;
		
		buff[0][2] = buff[0][3] = buff[0][4] = true;
		buff[4][2] = buff[4][3] = buff[4][4] = true;
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);

		for (int i = 2; i < ConsoleCharacter.ROW; i++) 
			buff[i][1] = true;
		
		buff[2][2] = buff[2][3] = true;
		buff[4][2] = buff[4][3] = true;
		return buff;
	}
}
