package Assignment_20_Java;

import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_10 {
	public static void main(String[] args) {
		List<String>conc=List.of("a","b","c","d");
		
		String concat=conc.stream()
				.collect(Collectors.joining(","));
		System.out.println(concat);
		
	}
}
