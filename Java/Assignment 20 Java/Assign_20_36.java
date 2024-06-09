package Assignment_20_Java;

import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_36 {
	public static void main(String[] args) {
		List<Integer>list=List.of(2,4,6,8);
		
		String comma=list.stream()
				.map(Object::toString)
				.collect(Collectors.joining(","));
		System.out.println(comma);
				
	}
}
