package Assignment_20_Java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign_20_14 {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
        .collect(Collectors.partitioningBy(number -> number % 2 == 0)); 
    
    System.out.println("Even numbers: " + evenOddMap.get(true));
    System.out.println("Odd numbers: " + evenOddMap.get(false));
  }
}

