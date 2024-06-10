package Assignment_20_Java;

import java.util.List;

public class Assign_20_42 {
	public static void main(String[] args) {
		List<String>list=List.of("hello","malayalam","acca");
		
		List<String>palindrome=list.stream()
				.filter(a -> a.equals(new StringBuilder(a).reverse().toString()))
				.toList();
		System.out.println(palindrome);
	}
}
