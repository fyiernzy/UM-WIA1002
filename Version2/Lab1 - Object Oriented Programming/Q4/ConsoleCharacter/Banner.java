package Lab1.Q4.ConsoleCharacter;

public class Banner {
	private boolean[][] banner;
	
	Banner(boolean[][] banner) {
		this.banner = banner;
	}
	
	public void print() {
		for (int i = 0; i < banner.length; i++) {
			for (int j = 0; j < banner[i].length; j++)
				System.out.print(banner[i][j] ? "*" : " ");
			System.out.println();
		}
		System.out.println();
	}
}
