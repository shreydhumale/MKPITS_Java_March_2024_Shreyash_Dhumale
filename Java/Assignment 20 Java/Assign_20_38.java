package Assignment_20_Java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign_20_38 {
	public static void main(String[] args) {
		List<String>list=List.of("a","bb","ccc","dddd");
		
		Map<Integer, List<String>> lenght=list.stream()
				.collect(Collectors.groupingBy(String::length));
		
	   System.out.println("lenght :"+lenght);
	}
}
