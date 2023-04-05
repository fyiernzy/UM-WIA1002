package Lab8.Q3;

public class ComparableBook implements Comparable<ComparableBook> {
	private int bookID;
	private String bookName;
	
	ComparableBook(int bookID, String bookName) {
		this.bookID = bookID;
		this.bookName = bookName;
	}
	
	@Override
	public int compareTo(ComparableBook o) {
		return Integer.compare(bookID, o.bookID);
	}
	
	@Override
	public String toString() {
		return String.format("(%d) %s", bookID, bookName);
	}
}
