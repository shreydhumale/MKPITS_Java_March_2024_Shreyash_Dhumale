package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;

public class Assign_20_2 {
	public static void main(String[] args) {
	    List<Integer> EvenNumbers = Arrays.asList(2, 5, 6, 8, 7);
	    
	    int maxNumber = EvenNumbers.stream()
	    		.max(Integer::compareTo)
	    		.orElseThrow();
	    
	    System.out.println(maxNumber);
	}
}
