package Assignment_20_Java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign_20_29 {
	public static void main(String[] args) {
		List<String> strings = List.of("A", "B", "C", "D");

		 Map<String, Long> frequencyMap = strings.stream()
                 .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

frequencyMap.forEach((string, frequency) -> System.out.println(string + ": " + frequency));
	}
}
