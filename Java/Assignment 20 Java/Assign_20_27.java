package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Assign_20_27 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bbb", "ccc", "dddd");

        Optional<String> shortestString = list.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        shortestString.ifPresent(System.out::println);
    }
}

