package Lab9.Q3.OOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StockQueue stockQueue = new StockQueue();
		
		while(true) {
			System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
			String input = sc.nextLine();
			
			if(input.isEmpty()) // .equals("") or .length() == 0
				break;
			
			if(isValidInput(input)) {
				String[] info = input.split("\\s");
				String share = info[1];
				String price = info[4].substring(1);
				
				if(info[0].equals("Buy")) {
					System.out.println("Buying now...");
					waiting();
					stockQueue.buy(share, price);
					System.out.println(stockQueue);
				} else {
					System.out.println("Selling the shares now...");
					waiting();
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
	
	public static void waiting() {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
