package Lab4.L4Q5;

public class FindMax {
	public static <E extends Comparable<E>> E max(E[] list) {
		if(list == null)
			return null;
		
		E max = list[0];
		for(int i = 1; i < list.length; i++) {
			if(list[i].compareTo(max) > 0)
				max = list[i];
		}
		
		return max;
	}
}
