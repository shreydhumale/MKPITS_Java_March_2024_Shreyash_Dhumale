package assignment_17;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorted_Unique_Elements {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers: ");
        String input = scanner.nextLine();
        
        String[] inputArray = input.split("\\s+");
        
        for (String numberString : inputArray) {
            try {
                int number = Integer.parseInt(numberString);
                treeSet.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + numberString + " is not an integer.");
            }
        }
        System.out.println("After sorting : " + treeSet);
    }
}
