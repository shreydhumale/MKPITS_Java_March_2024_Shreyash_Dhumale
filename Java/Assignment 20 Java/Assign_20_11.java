package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_11 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("aaa","bbbb","ccccc","dddddd");
		List<String> word=list.stream()
				.filter(a -> a.length()<5)
				.collect(Collectors.toList());
		System.out.println(word);
	}
}
