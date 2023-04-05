package Lab8.Q1.QueueUtils;

public class ArraysSupport {
	public static final int SOFT_MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
	
	public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
		int prefLength = oldLength + Math.max(minGrowth, prefGrowth);
		if(prefLength > 0 && prefLength <= SOFT_MAX_ARRAY_LENGTH) {
			return prefLength;
		} else {
			return hugeLength(oldLength, minGrowth);
		}
	}
	
	public static int hugeLength(int oldLength, int minGrowth) {
		int minLength = oldLength + minGrowth;
		if(minLength < 0) {
			throw new OutOfMemoryError(
					"Required array length " + oldLength + " + " + minGrowth + " is too large");
		} else if (minLength <= SOFT_MAX_ARRAY_LENGTH) {
			return SOFT_MAX_ARRAY_LENGTH;
		} else {
			return minLength;
		}
	}
}
