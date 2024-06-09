package Assignment_20_Java;

import java.util.List;

public class Assign_20_40 {
	public static void main(String[] args) {
		List<Integer>list=List.of(2,3,4,-5,-6);
				
		List<Integer> negative=list.stream()
				.filter(a-> a>0)
				.toList();
				
		System.out.println(negative);
	}
}
