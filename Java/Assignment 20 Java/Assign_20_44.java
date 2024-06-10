package Assignment_20_Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Assign_20_44 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaac", "abcd", "aacd");

        String maxAString = strings.stream()
                .max(Comparator.comparingLong(s -> s.chars().filter(ch -> ch == 'a').count()))
                .orElse(null);

        System.out.println(maxAString);
    }
}


