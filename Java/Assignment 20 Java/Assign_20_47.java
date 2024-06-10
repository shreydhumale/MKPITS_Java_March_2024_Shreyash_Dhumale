package Assignment_20_Java;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Assign_20_47 {
	public static void main(String[] args) {
		List<String>list=List.of("abc","xyz");
        Set<String> upperCaseStrings = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(upperCaseStrings);
	}
}
