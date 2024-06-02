package assignment_17; 

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Case_Insensitive_Word_Storage {
	public static void main(String[] args) {
         Set<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter a series of words (separated by spaces): ");
         String input = scanner.nextLine();

         String[] words = input.split("\\s+");

         for (String word : words) {
             treeSet.add(word);
         }

         System.out.println("After sorting : " + treeSet);
     }
 }
