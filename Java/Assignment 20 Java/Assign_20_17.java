package Assignment_20_Java;

import java.util.List;
import java.util.Optional;

public class Assign_20_17 {
	public static void main(String[] args) {
	List<Integer> list = List.of(2, 5, 6, 8, 7);
	
	 Optional<Integer> secondHighest =list.stream()
		        .distinct() 
		        .sorted(Integer::compareTo) 
		        .skip(1) 
		        .findFirst();
	 System.out.println("originsl list :"+list);
	 System.out.println("second highest number from the list :"+secondHighest);
	}
}
