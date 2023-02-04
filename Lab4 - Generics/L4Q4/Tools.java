package Lab4.L4Q4;

import java.util.Arrays;

public class Tools {
	public static <T extends Comparable<T>> String minmax(T... args) {
		T min = args[0], max = args[0];
		
		for(int i = 1; i < args.length; i++) {
			if(args[i].compareTo(min) < 0)
				min = args[i];
			
			else if(args[i].compareTo(max) > 0)
				max = args[i];
		}
		
		return String.format("Min = %s Max = %s", min, max);
	}
	
	public static <T extends Comparable<T>> String minMax(T... args) {
		T min = Arrays.stream(args).min((a, b) -> a.compareTo(b)).get();
		T max = Arrays.stream(args).max((a, b) -> a.compareTo(b)).get();
		
		return String.format("Min = %s Max = %s", min, max);
	}
	
	public static void main(String[] args) {
		
	}
}
