package Lab9a;

import java.util.*;

public class L9aQ2 {
	public static void main(String[] args) {
		List<String> arr = permuteString("ABC");
		System.out.println(arr);
		permuteString("", "ABC");
	}
	
	
	public static List<String> permuteString(String str) {
	    if (str.length() == 1) {
	        return List.of(str);
	    }

	    List<String> permutations = permuteString(str.substring(1));
	    List<String> result = new ArrayList<>();

	    for (String permutation : permutations) {
	        for (int c = 0; c <= permutation.length(); c++) {
	            result.add(permutation.substring(0, c) + str.charAt(0) + permutation.substring(c));
	        }
	    }

	    return result;
	}
	
	public static void permuteString(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println("Final = " + prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permuteString(prefix + str.charAt(i), prefix.substring(0, i) + prefix.substring(i + 1, n));
            }
        }
    }
}
