package Assignment_20_Java;

import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_6 {
	public static void main(String[] args) {
		 List<Integer> numbers = List.of(3,6,9,2,3,4,5,6,7,2);

		    List<Integer> uniqueNumbers = numbers.stream()
		        .distinct() 
		        .collect(Collectors.toList());

		    System.out.println("Original list: " + numbers);
		    System.out.println("Unique numbers: " + uniqueNumbers);
	}
}
