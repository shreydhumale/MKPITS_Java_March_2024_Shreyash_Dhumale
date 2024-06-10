package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;

public class Assign_20_48 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = list.stream()
                                  .mapToInt(n -> n * n)
                                  .sum();
        
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
