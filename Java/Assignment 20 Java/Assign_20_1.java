package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;

public class Assign_20_1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 6, 8, 7);

	    List<Integer> EvenNumbers = list.stream()
	        .filter(a -> a % 2 == 0)
	        .toList();
	    	System.out.println(EvenNumbers);
	}
}
