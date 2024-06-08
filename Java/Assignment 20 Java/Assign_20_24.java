package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_24 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		List<String> firstThree = list.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(firstThree); 

	}
}
