package Assignment_20_Java;

import java.util.List;

public class Assign_20_23 {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        
        Integer[] integerArray = integerList.stream().toArray(Integer[]::new);
        
        for (Integer num : integerArray) {
            System.out.print(num);
        }

	}
}
