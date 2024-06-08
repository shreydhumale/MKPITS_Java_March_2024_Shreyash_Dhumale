package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_26 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", null, "c", null, "d");
        
        List<String> noNull = list.stream()
        		.filter(i -> i != null)
        		.collect(Collectors.toList());
        
        System.out.println("List without nulls: " + noNull );
    }
}

