package Assignment_20_Java;

import java.util.List;

public class Assign_20_37 {
	public static void main(String[] args) {
		List<String>list=List.of("abcd","efgh","ehijk");
		
		Long count=list.stream()
				.filter(a-> a.contains("e"))
				.count();
		System.out.println(count+" strings contains e ");
		
	}
}
