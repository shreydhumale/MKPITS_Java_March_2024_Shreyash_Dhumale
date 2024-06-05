package assignment_19_7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Using_Predicates {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(8,9,12,13);
		
		Predicate<Integer>lessThan= a-> a<=10;
		
		List<Integer>list=numbers.stream()
				.filter(lessThan)
				.toList();
		System.out.println("original listn:"+ numbers);
		System.out.println("numbers less than 10 : "+list);
	}
}
