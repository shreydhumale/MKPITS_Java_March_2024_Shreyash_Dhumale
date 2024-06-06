package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;

public class Assign_20_3 {
	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(2, 5, 6, 8);
	    int sum=list.stream()
	    		.mapToInt(Integer::intValue)
	    		.sum();
	    System.out.println(sum);
	}
}
