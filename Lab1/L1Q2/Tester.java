package Lab1.L1Q2;

import java.io.File;
import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) throws Exception {
		String PARENT = "./src/Lab1/L1Q2/";
		String[] files = getFilesName(PARENT);
		DelimeterReader reader;
		
		for(int i = 0; i < 3; i++) {
			reader = new DelimeterReader(PARENT + files[i]);
			prettyPrint(reader);
		}
		
		reader = new DelimeterReader(PARENT + files[3], "\\d+");
		prettyPrint(reader);
		
	}
	
	public static String[] getFilesName(String parent) throws Exception {
		File folder = new File(parent);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> ls = new ArrayList<>();
		
		for (File file : listOfFiles) {
			if (file.isFile() && file.getName().endsWith(".txt")) 
				ls.add(file.getName());
		}
		
		return ls.toArray(new String[ls.size()]);
	}
	
	public static void prettyPrint(DelimeterReader reader) {
		System.out.println("--> " + reader.getFileName() + " <--");
		reader.printWithoutDelimeter();
		System.out.printf("Character count = %d \n\n", reader.countCharacter());
	}
	
	
}
