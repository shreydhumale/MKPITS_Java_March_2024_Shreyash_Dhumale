package assignment_19_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering_and_Collecting {
	public static void main(String[] args) {
	List<String> list=Arrays.asList("Animal","Birds","Human");
	List<String> word=list.stream()
			.filter(a -> !a.startsWith("A"))
			.collect(Collectors.toList());
	
	System.out.println("original list :"+list);
	System.out.println("new list :"+word);
	
	}
}
