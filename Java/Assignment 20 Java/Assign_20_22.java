package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Assign_20_22 {
	public static void main(String[] args) {
		//Assuming you have a Stream<String> named "stringStream"
		List<String>strings=List.of("Abcd","Efgh","Hijk");
		//Use filter to select strings starting with 'A' and findFirst to get the first element
		Optional<String> firstAString = strings.stream()
		.filter(str -> str.startsWith("A"))
		.findFirst();
		
		System.out.println(firstAString);

		if (firstAString.isPresent()) {
		String result = firstAString.get();
		System.out.println("First string starting with 'A': " + result);
		} else {
		System.out.println("No string starting with 'A' found in the stream.");
		}
	}
}

