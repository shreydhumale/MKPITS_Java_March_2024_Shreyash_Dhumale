package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_30 {
	public static void main(String[] args) {
		 List<Integer> list= Arrays.asList(2,4,6,8);

	        List<Integer> squares = list.stream()
	                                      .map(n -> n * n)
	                                      .collect(Collectors.toList());

	        System.out.println(squares);
	}
}
