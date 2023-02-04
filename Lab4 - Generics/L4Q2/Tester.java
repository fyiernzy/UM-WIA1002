package Lab4.L4Q2;

public class Tester {
	public static void main(String[] args) {
		MyGeneric<String> strObj = new MyGeneric<>();
		MyGeneric<Integer> intObj = new MyGeneric<>();
		
		strObj.setObject("Hello World");
		intObj.setObject(12345);
		
		System.out.println("strObj = " + strObj.getObject());
		System.out.println("intObj = " + intObj.getObject());
	}
}
