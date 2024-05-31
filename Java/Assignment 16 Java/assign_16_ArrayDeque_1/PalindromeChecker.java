package assign_16_ArrayDeque_1;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

    public static void main(String[] args) {
        String[] testStrings = {"malayalam"};

        for (String str : testStrings) {
            System.out.println(str +" is " + isPalindrome(str));
        }
    }

    public static String isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return "Not a Palindrome";
            }
        }

        return "Palindrome";
    }
}
