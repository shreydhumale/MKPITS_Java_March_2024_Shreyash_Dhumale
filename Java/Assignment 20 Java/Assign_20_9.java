package Assignment_20_Java;

import java.util.List;

public class Assign_20_9 {
	public static void main(String[] args) {
		List<String>list=List.of("abcd","efgh","hijk");
		
		boolean contains= list.stream().anyMatch((a) -> a.startsWith("a"));
		System.out.println(contains);
	}
}
