package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;

public class Assign_20_32 {
	public static void main(String[] args) {
        List<String> strings = Arrays.asList("AAA", "B", "CCCC", "DD");

		 int totalLength = strings.stream()
                 .mapToInt(String::length)
                 .sum();
		 System.out.println(totalLength);
	}
}
