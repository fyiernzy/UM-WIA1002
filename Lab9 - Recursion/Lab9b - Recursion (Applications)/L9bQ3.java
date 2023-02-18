package Lab9b;

import java.util.Scanner;
public class L9bQ3 {
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			count = 0;
			
			System.out.printf("Enter the value of disc/n = ");
			String ans = scanner.nextLine();
			
			if(ans.toLowerCase().startsWith("q"))
				break;
			
			int n = Integer.parseInt(ans);
			hanoi(n, "A", "C", "B");
			System.out.println("Steps taken = " + count);
			System.out.println("Steps taken = " + T(n));
			System.out.println("Steps taken = " + stepCount(n) + "\n");
		}
		
		scanner.close();
		
	}
	
	public static void hanoi(int disc, String src, String dst, String mid) {
		if(disc < 1) {
			System.out.println("Invalid");
		} else if(disc == 1) {
			System.out.printf("%d : %s --> %s\n", disc, src, dst);
			count++;
		} else {
			hanoi(disc - 1, src, mid, dst);
			System.out.printf("%d : %s --> %s\n", disc, src, dst);
			hanoi(disc - 1, mid, dst, src);
			count++;
		}
	}
	
//	public static int T(int n) {
//		return (n < 1) ? 0 : (int)(Math.pow(2, n)) - 1;
//	}
	
	public static int T(int n) {
		if(n == 1)
			return 1;
		
		int sum = n;
		
		for(int i = 1; i < n; i++) 
			sum += T(n - i);
		
		return sum;
	}
	
	public static int stepCount(int discNumber){
		if(discNumber == 1 ) {
			return 1;
		} else {
			return (int) Math.pow(2, discNumber - 1)  + stepCount(discNumber - 1);
		}
	}
}
