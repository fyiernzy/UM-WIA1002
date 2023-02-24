package Lab2.Q3;


public class UNOCard {
	static final String[] COLOR = {"Red", "Yellow", "Green", "Yellow"};
	static final String[] TYPE = {"One", "Two", "Three", "Four", "Five", "Six", "Seven",
										  "Eight", "Nine", "Skip", "Reverse", "Draw Two"};
	
	private String colour;
	private String type;
	
	UNOCard(String colour, String type) {
		this.colour = colour;
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("%s %s", this.colour, this.type);
	}
	
}
