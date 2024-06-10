package Assignment_20_Java;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Assign_20_50 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aa","bbb","cccc");

        String shortestString = strings.stream()
                                       .min(Comparator.comparingInt(String::length))
                                       .orElse(null);         
        System.out.println("Shortest string: " + shortestString);
    }
}

