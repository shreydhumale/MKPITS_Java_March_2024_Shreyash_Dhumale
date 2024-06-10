package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_46 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,60,70,80);
        
        List<Integer> filteredNumbers = list.stream()
                                               .filter(n -> n <= 40)
                                               .collect(Collectors.toList());
        
        System.out.println(filteredNumbers);
    }
}
