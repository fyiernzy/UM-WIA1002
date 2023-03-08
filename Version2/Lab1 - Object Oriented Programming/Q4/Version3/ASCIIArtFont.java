package Lab1.Q4.V3;

public enum ASCIIArtFont {
	ART_FONT_DIALOG("Dialog"),
	ART_FONT_DIALOG_INPUT("Dialog Input"),
	ART_FONT_MONO("Monospaced"),
	ART_FONT_SERIF("Serif");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	private ASCIIArtFont(String value) {
		this.value = value;
	}
}