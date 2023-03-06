package Lab1.Q5;

public class Tester {
	public static final String TEXT_TYPE = "text file";
	public static final String BIN_TYPE = "binary file";
	
	public static void main(String[] args) {
		TextFile textFile = new TextFile();
		BinaryFile binaryFile = new BinaryFile();
		String content = "Welcome to FSKTM!\n"
				+ "Please register your matric number.\n"
				+ "Please register your UMMail account.";
		String textFilePath = "./src/Lab1/Q5/io_files/content.txt";
		String binFilePath = "./src/Lab1/Q5/io_files/content.dat";
		
		write(textFile, TEXT_TYPE, textFilePath, content, false);
		read(textFile, TEXT_TYPE, textFilePath);
		write(binaryFile, BIN_TYPE, binFilePath, content, false);
		read(binaryFile, BIN_TYPE, binFilePath);
	}
	
	public static void read(FileIO fileReader, String fileType, String filePath) {
		System.out.println("Read from " + fileType);
		String content = fileReader.read(filePath);
		if(content != null)
			System.out.print(fileReader.read(filePath));
	}
	
	public static void write(FileIO fileReader, String fileType, String filePath, String content, boolean append) {
		System.out.println("Write to " + fileType);
		System.out.println(content);
		fileReader.write(filePath, content, append);
	}
}
