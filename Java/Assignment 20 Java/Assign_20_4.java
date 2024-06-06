package Assignment_20_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
	
public class Assign_20_4 {
	public static void main(String[] args) {
		    List<String> names = new ArrayList<>();
		    names.add("abcd");
		    names.add("efgh");
		    names.add("xyz");

		    List<String> uppercaseNames = names.stream()
		        .map(String::toUpperCase) 
		        .collect(Collectors.toList());

		    System.out.println("Original list: " + names);
		    System.out.println("Uppercase list: " + uppercaseNames);
	}
}
