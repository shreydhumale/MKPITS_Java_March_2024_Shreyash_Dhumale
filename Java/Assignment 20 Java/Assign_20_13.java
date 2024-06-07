package Assignment_20_Java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign_20_13 {
	public static void main(String[] args) {
		List<String>names=List.of("aa","bbb","cccc","ddddd");
		
		Map<Integer, List<String>> length=names.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(length);
	}
}
