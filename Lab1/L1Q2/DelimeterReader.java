package Lab1.L1Q2;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.*;


public class DelimeterReader {
	public static String PUNCT = "[\\p{Punct}\\s]+";
	
	private String delimeter;
	private String filePath;
	
	public DelimeterReader(String filePath, String delimeter) {
		this.filePath = filePath;
		this.delimeter = delimeter;
	}
	
	public DelimeterReader(String filePath) {
		this(filePath, DelimeterReader.PUNCT);
	}
	
	public Stream<String> readLines(){
		try {
			return Files.lines(Paths.get(this.filePath));
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public void printWithoutDelimeter() {
		try(BufferedReader reader = new BufferedReader(new FileReader(this.filePath))){
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(String.join("", line.split(this.delimeter)));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public int countCharacter() {
		try(BufferedReader reader = new BufferedReader(new FileReader(this.filePath))){
			String line;
			int count = 0;
			while((line = reader.readLine()) != null) {
				String[] tmp = line.split(this.delimeter);
				
				for(String word : tmp)
					count += word.length();
			}
			
			return count;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	
	public String getFileName() {
		return new File(this.filePath).getName();
	}
}
