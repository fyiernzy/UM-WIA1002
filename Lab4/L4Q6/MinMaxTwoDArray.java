package Lab4.L4Q6;

import java.util.Arrays;

public class MinMaxTwoDArray {
	public static <E extends Comparable<E>> E min(E[][] list) {
		if(list == null)
			return null;
		
		E min = list[0][0];
		for(int row = 0; row < list.length; row++) {
			for(int column = 0; column < list.length; column++) {
				if(list[row][column].compareTo(min) < 0)
					min = list[row][column];
			}
		}
		
		return min;
	}
	
	public static <E extends Comparable<E>> E max(E[][] list) {
		if(list == null)
			return null;
		
		E max = list[0][0];
		for(int row = 0; row < list.length; row++) {
			for(int column = 0; column < list.length; column++) {
				if(list[row][column].compareTo(max) > 0)
					max = list[row][column];
			}
		}
		
		return max;
	}
	
	public static <E extends Comparable<E>> E streamMin(E[][] list) {
		  return Arrays.stream(list)
		    .flatMap(Arrays::stream)
		    .min(Comparable::compareTo)
		    .orElse(null);
		}

		public static <E extends Comparable<E>> E streamMax(E[][] list) {
		  return Arrays.stream(list)
		    .flatMap(Arrays::stream)
		    .max(Comparable::compareTo)
		    .orElse(null);
		}
}
