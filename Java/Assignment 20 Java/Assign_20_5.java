package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_5 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("encapsulation","polymorphism","abstraction","inheritance");
		List<String> sorted=list.stream()
				.sorted().collect(Collectors.toList());
		System.out.println("original list :"+list);
		System.out.println("new list :"+sorted);
	}
}
