package Lab2.Q2;

public class Tester {
	public static void main(String[] args) {
		System.out.println("Create a text file log with maximum record equal to 5");
		TextFileLog<String> textFileLog = new TextFileLog<>(5);
		
		String[] names = {"James", "Ahmad", "Siti", "Ramesh", "John"};
		for(String name : names) 
			textFileLog.insert(name);
		
		textFileLog.display();
		System.out.println();
		
		System.out.println("Adding another record");
		textFileLog.insert("Ng");
		System.out.println("The log is " + (textFileLog.isFull() ? "full" : "not full"));
		
		String name = "Siti";
		System.out.printf("Searching for %s in the file\n", name);
		System.out.printf("Text File Log %s %s\n", textFileLog.contains(name) ? "contains" : "does not contain", name);
	
		System.out.println("Clear the text file log");
		textFileLog.clear();
		System.out.println("Text File Log Size " + textFileLog.size());
	}
}
