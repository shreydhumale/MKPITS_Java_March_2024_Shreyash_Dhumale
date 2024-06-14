package Programs;

/* Write a Java program to remove duplicate values from array */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program_12 {
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int value : array) {
            set.add(value);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 1, 2, 4, 5, 6, 4, 7, 8, 9, 7};

        int[] arrayWithoutDuplicates = removeDuplicates(arr);

        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }
}


