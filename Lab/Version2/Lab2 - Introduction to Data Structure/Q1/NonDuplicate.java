package Lab2.Q1;

import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class NonDuplicate<T extends List<Integer>> {
	private static final int LOWER = 0;
	private static final int UPPER = 100;
	
	private T list;
	private int lowerBound;
	private int upperBound;
	
	public NonDuplicate(T list) {
		this(list, LOWER, UPPER);
	}
	
	NonDuplicate(T list, int lowerBound, int upperBound) {
		this.list = list;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	public T implement(int size) {
		Random rand = new Random();
		Set<Integer> set = new HashSet<>(); 
		while(set.size() < size) 
			set.add(rand.nextInt(upperBound - lowerBound + 2) + lowerBound);
		list.addAll(set);
		Collections.sort(list);
		return list;
	}
}
