package Lab1.Q4.V3;

//reference: https://www.quickprogrammingtips.com/java/ascii-art-generator-library-in-java.html

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ASCIIArtGenerator {
	public static final int ART_SIZE_SMALL = 12;
	public static final int ART_SIZE_MEDIUM = 18;
	public static final int ART_SIZE_LARGE = 24;
	public static final int ART_SIZE_HUGE = 32;
	public static final String DEFAULT_SYMBOL = "*";

	public void printTextArt(String artText, int textHeight, ASCIIArtFont fontType, String artSymbol) {
		String fontName = fontType.getValue();
		int imageWidth = findImageWidth(textHeight, artText, fontName);

		BufferedImage image = new BufferedImage(imageWidth, textHeight, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		Font font = new Font(fontName, Font.BOLD, textHeight);
		g.setFont(font);

		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.drawString(artText, 0, getBaselinePosition(g, font));

		for (int y = 0; y < textHeight; y++) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < imageWidth; x++)
				sb.append(image.getRGB(x, y) == Color.WHITE.getRGB() ? artSymbol : " ");
			if (sb.toString().trim().isEmpty())
				continue;
			System.out.println(sb);
		}
	}

	public void printTextArt(String artText, int textHeight) {
		printTextArt(artText, textHeight, ASCIIArtFont.ART_FONT_DIALOG, DEFAULT_SYMBOL);
	}

	private int findImageWidth(int textHeight, String artText, String fontName) {
		BufferedImage im = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
		Graphics g = im.getGraphics();
		g.setFont(new Font(fontName, Font.BOLD, textHeight));
		return g.getFontMetrics().stringWidth(artText);
	}

	private int getBaselinePosition(Graphics g, Font font) {
		FontMetrics metrics = g.getFontMetrics(font);
		int y = metrics.getAscent() - metrics.getDescent();
		return y;
	}
}
