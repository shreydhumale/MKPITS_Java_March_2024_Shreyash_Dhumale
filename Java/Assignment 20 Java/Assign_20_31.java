package Assignment_20_Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Assign_20_31 {
	public static void main(String[] args) {
        List<String> strings = Arrays.asList("AAA", "B", "CCCC", "DD");
		
        strings.sort(Comparator.comparingInt(String::length));

        System.out.println(strings);
	}
}
