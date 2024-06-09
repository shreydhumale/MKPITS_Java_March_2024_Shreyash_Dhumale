package Assignment_20_Java;

import java.util.List;
import java.util.OptionalDouble;

public class Assign_20_39 {
	public static void main(String[] args) {
		List<String>list=List.of("abcd","efgh");
		
		OptionalDouble countString=list.stream()
				.mapToInt(String::length)
				.average();
		System.out.println("average : "+countString);
	}
}
