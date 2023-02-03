package Lab3;

public class L3Q1 {
	public static void main(String[] args) {
		System.out.printf("F(%d,%d) = %d\n", 4, 10, F(4,10));
		System.out.printf("F(%d,%d) = %d\n", 12, 8, F(12,8));
		System.out.printf("F(%d,%d) = %d\n", 7, 12, F(7,12));
	}
	
	public static int F(int s, int t) {
		if(s == 1 || t == 1)
			return s;
		
		return F(s - 1, t) + F(s, t - 1);
	}
}
