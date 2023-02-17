package Lab9.Q3.OOP;

import java.util.LinkedList;
import java.util.Queue;

public class StockQueue {
	private Queue<Stock> stockQueue;
	private int totalGain;
	
	StockQueue() {
		stockQueue = new LinkedList<Stock>();
	}
	
	public void buy(int share, int price) {
		stockQueue.offer(new Stock(share, price));
	}
	
	public void buy(String share, String price) {
		buy(Integer.parseInt(share), Integer.parseInt(price));
	}
	
	public void sell(int share, int price) {
		try {
			for(int tmp = share; tmp > 0; ) {
				Stock first = stockQueue.peek();
				int min = Math.min(tmp, first.getShare());			
				totalGain += min * (price - first.getPrice());
				
				if(!first.sellShare(tmp))
					stockQueue.remove();
				
				System.out.println("Total Capital Gain / Loss: " + totalGain);
				
				tmp -= min;
			}
		} catch(NullPointerException ex) {
			System.out.println("No shares to sell!");
		}
	}
	
	public void sell(String share, String price) {
		sell(Integer.parseInt(share), Integer.parseInt(price));
	}
	
	public int getTotalGain() {
		return totalGain;
	}
	
	@Override
	public String toString() {
		StringBuilder share = new StringBuilder();
		StringBuilder price = new StringBuilder();
		
		for(Stock stock : stockQueue) {
			share.append(stock.getShare()).append(',').append(' ');
			price.append(stock.getPrice()).append(',').append(' ');
		}
		
		// Eliminate the ", "
		if(share.length() > 2) share.setLength(share.length() - 2);
		if(price.length() > 2) price.setLength(price.length() - 2);
		
		return String.format("Queue for Share: [%s]\nQueue for Price: [%s]", share, price);
	}
	
	
}
