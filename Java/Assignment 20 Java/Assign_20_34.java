package Assignment_20_Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_34 {
	public static void main(String[] args) {
        List<String> strings = Arrays.asList("AAA", "B", "CCCC", "DD");

        List<String> reversedList = strings.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                    Collections.reverse(lst);
                    return lst;
                }));
        
        System.out.println(reversedList);
	}
}
