package assignment_19_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combining_Operations {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2, 5, 6, 8);

    List<Integer> EvenNumbers = list.stream()
        .filter(a -> a % 2 == 0)
        .toList();
    	System.out.println(EvenNumbers);
    	
    List<Integer> doubledEvenNumbers=list.stream()
        .map(a -> a * 2) 
        .collect(Collectors.toList());
    	System.out.println(doubledEvenNumbers);

    System.out.println("Sum of doubled even numbers: " + 
        doubledEvenNumbers.stream().mapToInt(Integer::intValue).sum());
  }
}
