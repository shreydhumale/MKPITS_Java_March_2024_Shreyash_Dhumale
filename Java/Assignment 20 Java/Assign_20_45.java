package Assignment_20_Java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_45 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd", "xyz", "abc", "abcd");

        List<String> distinctStrings = list.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .collect(Collectors.toList());

        System.out.println(distinctStrings);
    }
}
