public class UseGenericBox	{

	public static void main(String args[])	{
		GenericBox<String> box1 = new GenericBox<>();
		GenericBox<Integer> box2 = new GenericBox<>();
		
		box1.store("Hello World");
		box2.store(100);
		
		System.out.println("Box 1 has " + box1.toString() );
		System.out.println("Bos 2 has " + box2.toString() );
		
		box1.remove();
		box2.remove();

		System.out.println("After removal, box 1 has " + box1.toString() );
		System.out.println("After removal, box 2 has " + box2.toString() );
		
		//box1.store(100);              these lines were removed because
		//box2.store("Hello World");	they caused compilation error
	}
}

