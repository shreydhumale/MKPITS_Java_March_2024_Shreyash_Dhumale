package assignment_19_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,20,30,40);
		
		List<Integer> doubleList=list.stream()
				.map(a -> a*2)
				.collect(Collectors.toList());
		System.out.println("original list : "+list);
		System.out.println("new list : "+doubleList);
	}
}
