package Assignment_20_Java;

import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_28 {
	public static void main(String[] args) {
		List<String> strings = List.of("A", "B", "C", "D");

        String result = strings.stream()
                              .collect(Collectors.joining(" | "));

        System.out.println(result);
	}
}
