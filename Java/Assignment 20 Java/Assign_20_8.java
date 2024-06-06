package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Assign_20_8 {
	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(2, 5, 6, 8);

	    OptionalDouble average=list.stream()
	    		.mapToDouble(Integer::doubleValue)
	    		.average();
	    System.out.println("average :"+average);	
	}
}
