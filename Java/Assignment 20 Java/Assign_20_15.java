package Assignment_20_Java;

import java.util.List;

public class Assign_20_15{

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    int product = numbers.stream()
        .mapToInt(Integer::intValue) 
        .reduce(1, Math::multiplyExact);

    System.out.println("Product of all numbers: " + product);
  }
}
