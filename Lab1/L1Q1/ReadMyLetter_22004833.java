package Lab1.L1Q1;

import java.io.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadMyLetter_22004833 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Second part: ");
		String part = scanner.nextLine();
		scanner.close();
		
		try {
			PrintWriter writer = new PrintWriter(new FileOutputStream(new File("./src/Lab1/L1Q1/ZhiYang_22004833.txt"), true));
			System.out.println(new SimpleDateFormat("EEEE, d MMMM yyyy").format(new Date()));
			writer.println(part);
			writer.close();
			
			BufferedReader reader = new BufferedReader(new FileReader("./src/Lab1/L1Q1/ZhiYang_22004833.txt"));
			StringBuilder sb = new StringBuilder();
			char[] buff = new char[8192];
			int byteRead;
			
			while((byteRead = reader.read(buff)) != -1) 
				sb.append(buff, 0, byteRead);
			
			reader.close();
			System.out.println(sb);
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
