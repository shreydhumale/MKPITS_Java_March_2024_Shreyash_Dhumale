package Assignment_20_Java;

import java.util.List;

public class Assign_20_35 {
	public static void main(String[] args) {
List<String> list= List.of("abc","dab","ebcxxx");
		
		List<Character> unique=list.stream()
				.flatMapToInt(String::chars)
				.distinct()
				.mapToObj(a->(char)a)
				.toList();
		System.out.println(unique);
	}
}
