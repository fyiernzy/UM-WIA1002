package Lab1.Q4.ConsoleCharacter;

public class A extends ConsoleCharacter {

	public boolean[][] getUppercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);

		buff[0][2] = buff[2][2] = true;
		for (int i = 1; i < ConsoleCharacter.ROW; i++)
			buff[i][1] = buff[i][3] = true;

		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);

		for (int i = 0; i < ConsoleCharacter.ROW; i++) 
			buff[i][4] = true;
		
		buff[0][2] = buff[0][3] = true;
		buff[1][1] = buff[1][4] = true;
		buff[2][1] = buff[2][4] = true;
		buff[3][2] = buff[3][3] = true;

		return buff;
	}
	
}
