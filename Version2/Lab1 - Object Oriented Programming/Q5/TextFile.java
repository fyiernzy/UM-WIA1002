package Lab1.Q5;

import java.io.*;
import java.util.Scanner;

public class TextFile implements FileIO {
	
	@Override
	public String read(String filePath) {
		StringBuilder sb = new StringBuilder();
		if(filePath.endsWith(".txt")) {
			try(Scanner sc = new Scanner(new File(filePath))) {
				while(sc.hasNextLine()) 
					sb.append(sc.nextLine()).append('\n');
			} catch(FileNotFoundException ex) {
				System.out.println("The file does not exist");
			}
		} else {
			System.out.println("Not a text file");
		}
		return sb.toString();
	}
	
	@Override
	public void write(String filePath, String content, boolean append) {
		if(filePath.endsWith(".txt")) {
			try(PrintWriter writer = new PrintWriter(new FileWriter(filePath, append))) {
				writer.println(content);
			} catch(FileNotFoundException ex) {
				System.out.println("The file does not exist");
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		} else {
			System.out.println("Not a text file");
		}
	}
}
