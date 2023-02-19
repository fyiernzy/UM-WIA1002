package Lab7.Q3.OOP;

import java.io.*;
import java.util.Scanner;

public class Simulator {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileInputStream("./src/Lab9/Q3/OOP/Q3.txt"));
		StockQueue stockQueue = new StockQueue();
		
		while(sc.hasNextLine()) {
			System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
			String input = sc.nextLine();
			waiting(250);
			System.out.println(input);
			waiting(500);
			
			if(isValidInput(input)) {
				String[] info = input.split("\\s");
				String share = info[1];
				String price = info[4].substring(1);
				
				if(info[0].equals("Buy")) {
					System.out.println("Buying now...");
					waiting(1000);
					stockQueue.buy(share, price);
					System.out.println(stockQueue);
				} else {
					System.out.println("Selling the shares now...");
					waiting(1000);
					stockQueue.sell(share, price);
					System.out.println(stockQueue);
				}
			} else {
				System.out.println("Invalid input: " + input);
			}
		}
		
		System.out.println("Final Capital Gain / Loss: " + stockQueue.getTotalGain());
		sc.close();
	}
	
	public static boolean isValidInput(String input) {
		return input.matches("(Buy|Sell) (\\d+) shares at \\$(\\d+) each");
	}
	
	public static void waiting(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
