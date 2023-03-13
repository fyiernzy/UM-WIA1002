package Lab1.Q5;

public interface FileIO {
	String read(String filePath);
	public void write(String filePath, String content, boolean append);
}
