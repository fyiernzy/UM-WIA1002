package Lab4.L4Q3;

public class Tester {
	public static int MAXIMUM = 1;
	public static int MAXIMAL = 2;
	public static int MAX = 3;
	
	public static void main(String[] args) {
		String strOne = "a", strTwo = "b", strThree = "c";
		System.out.printf("Test case: [%s, %s, %s]\n", strOne, strTwo, strThree);
		testFunction(1, strOne, strTwo, strThree);
		testFunction(2, strOne, strTwo, strThree);
		testFunction(3, strOne, strTwo, strThree);
		
		System.out.println("");
		
		int intOne = 4, intTwo = 5, intThree = 6;
		System.out.printf("Test case: [%s, %s, %s]\n", intOne, intTwo, intThree);
		testFunction(1, intOne, intTwo, intThree);
		testFunction(2, intOne, intTwo, intThree);
		testFunction(3, intOne, intTwo, intThree);
		
	}
	
	public static <T extends Comparable<T>> void testFunction(int functionCode, T o1, T o2, T o3) {
		if (!(functionCode <= 3 && functionCode >= 1)) {
			System.out.println("Invalid code");
			return ;
		}
		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		if (functionCode == MAXIMUM)
			System.out.println("Using CompareMax.maximum() = " + CompareMax.maximum(o1, o2, o3));
		else if (functionCode == MAXIMAL)
			System.out.println("Using CompareMax.maximal() = " + CompareMax.maximal(o1, o2, o3));
		else if (functionCode == MAX)
			System.out.println("Using CompareMax.max() = " + CompareMax.max(o1, o2, o3));
		
		endTime = System.nanoTime();
		System.out.println("Time used = " + (endTime - startTime) + " ns");
	}
	
	
}
