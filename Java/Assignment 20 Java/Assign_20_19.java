package Assignment_20_Java;

import java.util.List;

public class Assign_20_19 {
	public static void main(String[] args) {
		List<String>names=List.of("abcd");
		List<String>names1=List.of("");

		
		boolean isEmpty=names.stream()
				.allMatch(String::isEmpty);
		System.out.println(isEmpty);//this will return false
		
		boolean isEmpty1=names1.stream()
				.allMatch(String::isEmpty);
		System.out.println(isEmpty1);//this will return true
		
	}
}
