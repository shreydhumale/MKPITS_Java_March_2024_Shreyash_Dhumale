package Assignment_20_Java;

import java.util.ArrayList;
import java.util.List;

public class Assign_20_41 {
	public static void main(String[] args) {
		List<List<String>>lists=new ArrayList<>();
		lists.add(List.of("a","b","c"));
		lists.add(List.of("d","e","f"));
		lists.add(List.of("g","h","i"));
		
		List<String> concat=lists.stream()
				.flatMap(List::stream)
				.toList();
		System.out.println(concat);
	}
}
