package assignment_19_5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping_and_Counting {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,9,8,7,10,8);
		Stream<Integer> stream=list.stream();
		Map<Integer, Long> map=stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
}
