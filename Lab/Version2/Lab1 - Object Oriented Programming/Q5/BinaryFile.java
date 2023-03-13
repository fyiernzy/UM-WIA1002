package Lab1.Q5;

import java.io.*;

public class BinaryFile implements FileIO {
	
	@Override
	public String read(String filePath) {
		StringBuilder sb = new StringBuilder();
		if(filePath.endsWith(".dat")) {
			try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(filePath))) {
				while(true) 
					sb.append(input.readUTF()).append('\n');
			} catch(EOFException ex) {
			} catch(FileNotFoundException ex) {
				System.out.println("The file does not exist");
			} catch(IOException ex) {}
		} else {
			System.out.println("Not a binary file");
		}
		return sb.toString();
	}
	
	@Override
	public void write(String filePath, String content, boolean append) {
		if(filePath.endsWith(".dat")) {
			try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filePath, append))) {
				writer.writeUTF(content);
			} catch(FileNotFoundException ex) {
				System.out.println("The file does not exist");
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		} else {
			System.out.println("Not a binary file");
		}
	}
}
