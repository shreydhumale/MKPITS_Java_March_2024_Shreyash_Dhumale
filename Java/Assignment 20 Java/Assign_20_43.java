package Assignment_20_Java;

import java.util.List;

public class Assign_20_43 {
	public static void main(String[] args) {
		List<String>list=List.of("abcd","efgh","hijk");
		
		List<String>firstLetter=list.stream()
				.map(a -> a.substring(0, 1))
				.toList();
		System.out.println(firstLetter);
	}
}
