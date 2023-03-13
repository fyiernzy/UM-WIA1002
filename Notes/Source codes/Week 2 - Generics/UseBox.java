public class UseBox	{

	public static void main(String args[])	{
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.store("Hello World");
		box2.store(100);
		
		System.out.println("Box 1 has " + box1.toString() );
		System.out.println("Bos 2 has " + box2.toString() );
      
      int c = box1.retrieve().compareTo(box2.retrieve());  
	}
}

