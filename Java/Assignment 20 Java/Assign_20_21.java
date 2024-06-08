package Assignment_20_Java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign_20_21 {
	public static void main(String[] args) {
		List<String>nameStrings=List.of("a","bb","ccc","dddd");
		
		Map<String, Integer> nameLengths = nameStrings.stream()
		        .collect(Collectors.toMap(String::toString, String::length));
		
		System.out.println(nameLengths);
	}
}
