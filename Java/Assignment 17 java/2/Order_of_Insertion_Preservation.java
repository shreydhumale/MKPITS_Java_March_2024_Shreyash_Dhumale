package assignment_17;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Order_of_Insertion_Preservation {
    public static void main(String[] args) {
        Set<Integer> uniqueIntegers = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers :");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        }
        
        scanner.close();
        
        System.out.println("Unique integers in the order of insertion:");
        for (int num : uniqueIntegers) {
            System.out.print(num + " ");
        }
    }
}
