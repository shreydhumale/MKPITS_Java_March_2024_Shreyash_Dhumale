package assignment_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_of_Characters_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : input.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}


