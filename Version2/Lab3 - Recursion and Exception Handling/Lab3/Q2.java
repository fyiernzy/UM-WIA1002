package Lab3;

import java.io.*;
import java.awt.Desktop;

public class Q2 {
	public static void main(String[] args) {
		String from = "./src/Lab3/io_files/text.txt";
		String to = "./src/Lab3/io_files/reverse.txt";
		
		try {
			// Write a reverse file
			BufferedReader reader = new BufferedReader(new FileReader(from));
			PrintWriter writer = new PrintWriter(to);
			reverseFile(reader, writer);
			
			Desktop desktop = Desktop.getDesktop();
			
			// Read text.txt
			desktop.open(new File(from));
			
			// Read reverse.txt
			desktop.open(new File(to));
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void reverseFile(BufferedReader reader, PrintWriter writer) throws IOException {
		String line;
		if((line = reader.readLine()) != null) {
			reverseFile(reader, writer);
			writer.println(line);
			writer.flush();
		}
	}
}
