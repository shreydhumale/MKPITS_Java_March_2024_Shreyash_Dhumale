package assignment_19_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Cat","Dog","Bear","Lion");
		List<String> sorted=list.stream()
				.sorted().collect(Collectors.toList());
		System.out.println("original list :"+list);
		System.out.println("new list :"+sorted);
	}
}
