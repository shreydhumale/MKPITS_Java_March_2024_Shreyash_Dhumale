package Assignment_20_Java;

import java.util.List;
import java.util.stream.Collectors;


public class Assign_20_18 {
	public static void main(String[] args) {
		List<Integer>list=List.of(2,3,4,5,6,7);
		
		List<String> stringIntegers=list.stream()
				.map(String::valueOf)
				.collect(Collectors.toList());
		System.out.println(stringIntegers);
	}
}
