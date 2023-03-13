package Lab1.Q4.V3;

public class Banner {
	private ASCIIArtGenerator artGen;
	private ASCIIArtFont fontType;
	private int fontSize;
	private String symbol;
	
	Banner() {
		artGen = new ASCIIArtGenerator();
		this.fontType = ASCIIArtFont.ART_FONT_MONO;
		this.fontSize = ASCIIArtGenerator.ART_SIZE_MEDIUM;
		this.symbol = ASCIIArtGenerator.DEFAULT_SYMBOL;
	}
	
	public void setFontSize(int size) {
		this.fontSize = size;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public void setFontType(ASCIIArtFont fontType) {
		this.fontType = fontType;
	}
	
	public void print(String message) {
        System.out.println();
        artGen.printTextArt(message, fontSize, fontType, symbol);
        System.out.println();
	}
}
