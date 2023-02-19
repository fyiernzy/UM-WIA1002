package Lab7.Q3.OOP;

public class Stock {
	private int share;
	private int price;
	
	public Stock(int share, int price) {
		this.share = share;
		this.price = price;
	}
	
	public boolean sellShare(int share) {
		if(share < this.share) {
			this.share -= share;
			return true;
		}
		return false;		
	}

	public int getShare() {
		return share;
	}

	public int getPrice() {
		return price;
	}
	
}
