package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign_20_49 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello","Bye");

        Map<String, String> reverse = strings.stream()
        		.collect(Collectors.toMap(
                str -> str, 
                str -> new StringBuilder(str).reverse().toString()));

        System.out.println(reverse);
    }
}
