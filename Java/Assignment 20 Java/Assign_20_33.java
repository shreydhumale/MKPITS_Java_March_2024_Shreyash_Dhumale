package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_33 {
	public static void main(String[] args) {
		 List<Integer> list= Arrays.asList(2,4,6,8,-2,-4);

        List<Integer> numbers = list.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        System.out.println(numbers);
	}
}
