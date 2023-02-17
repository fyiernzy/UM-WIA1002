package Lab9.Q3.Functional;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCapitalGain = 0;
		Queue<Integer> shareQueue = new LinkedList<Integer>();
		Queue<Integer> priceQueue = new LinkedList<Integer>();

		while (true) {
			System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
			String query = sc.nextLine();

			if (query.isEmpty())
				break;

			if (isValidQuery(query)) {
				String[] info = query.split("\\s");
				int share = Integer.parseInt(info[1]);
				int price = Integer.parseInt(info[4].substring(1));

				if (info[0].equals("Buy")) {
					buy(shareQueue, priceQueue, share, price);
				} else {
					totalCapitalGain = sell(shareQueue, priceQueue, share, price, totalCapitalGain);
				}

			} else {
				System.out.println("Invalid query: " + query);
			}

		}

		System.out.println("Final Capital Gain / Loss: " + totalCapitalGain);
		sc.close();
	}

	public static boolean isValidQuery(String query) {
		return query.matches("(Buy|Sell) (\\d+) shares at \\$(\\d+) each");
	}

	static int sellShare(Queue<Integer> shareQueue, Queue<Integer> priceQueue, int share, int price,
			int totalCapitalGain) {
		while (share > 0) {
			if (shareQueue.isEmpty()) {
				System.out.println("No shares to sell!");
				break;
			}

			if (share >= shareQueue.peek()) {
				int queueShare = shareQueue.poll();
				totalCapitalGain += queueShare * (price - priceQueue.poll());
				share -= queueShare;
			}

			else {
				totalCapitalGain += share * (price - priceQueue.peek());

				// In order to subtract the share, we have to offer the new value
				// and move the others to the back

				shareQueue.offer(shareQueue.poll() - share);
				for (int i = shareQueue.size(); i > 1; i--) {
					shareQueue.offer(shareQueue.poll());
				}
				
				share = 0;
			}

			System.out.println("Total Capital Gain / Loss: " + totalCapitalGain);
		}
		return totalCapitalGain;
	}

	public static int sell(Queue<Integer> shareQueue, Queue<Integer> priceQueue, int share, int price,
			int totalCapitalGain) {
		System.out.println("Selling the shares now...");
		waiting();
		int value = sellShare(shareQueue, priceQueue, share, price, totalCapitalGain);
		printQueue(shareQueue, priceQueue);
		return value;
	}

	static void buyShare(Queue<Integer> shareQueue, Queue<Integer> priceQueue, int share, int price) {
		shareQueue.offer(share);
		priceQueue.offer(price);
	}

	public static void buy(Queue<Integer> shareQueue, Queue<Integer> priceQueue, int share, int price) {
		System.out.println("Buying now...");
		waiting();
		buyShare(shareQueue, priceQueue, share, price);
		printQueue(shareQueue, priceQueue);
	}

	public static void printQueue(Queue<Integer> shareQueue, Queue<Integer> priceQueue) {
		System.out.println("Queue for Share: Queue: " + shareQueue);
		System.out.println("Queue for Price: Queue: " + priceQueue);
	}

	static void waiting(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	static void waiting() {
		waiting(1000);
	}
}
