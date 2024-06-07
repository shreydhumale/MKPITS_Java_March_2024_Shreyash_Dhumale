package Assignment_20_Java;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Assign_20_12 {
	public static void main(String[] args) {
		
		List<String>names=List.of("aa","bbb","cccc","ddddd");
		Optional<String> longestString = names.stream()
		        .max(Comparator.comparingInt(String::length));
		System.out.println("longest string :"+longestString);
	}
}
