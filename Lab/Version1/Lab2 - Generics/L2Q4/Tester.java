package Lab2.L2Q4;

import java.util.Arrays;

public class Tester {
	public static int STREAM_MINMAX = 1;
	public static int FOR_MINMAX = 2;
	
	public static void main(String[] args) {
		Integer[] intArray = {5,3,7,1,4,9,8,2};
		String[] strArray = {"red", "blue", "orange", "tan"};
		
		System.out.println("Test case: " + Arrays.toString(strArray));
		testFunction(1, strArray);
		testFunction(2, strArray);
		
		System.out.println("");
		
		System.out.println("Test case: " + Arrays.toString(intArray));
		testFunction(1, intArray);
		testFunction(2, intArray);
	}
	
	public static <T extends Comparable<T>> void testFunction(int functionCode, T[] args) {
		if (!(functionCode <= 2 && functionCode >= 1)) {
			System.out.println("Invalid code");
			return ;
		}
		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		if (functionCode == STREAM_MINMAX)
			System.out.println("Using Stream minmax() : " + Tools.minMax(args));
		else if (functionCode == FOR_MINMAX)
			System.out.println("Using For minMax() : " + Tools.minmax(args));
		
		endTime = System.nanoTime();
		System.out.println("Time used = " + (endTime - startTime) + " ns");
	}
}
