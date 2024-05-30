package assign_16_Stack_3;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String[] strings = {"Last In First Out"};

        for (String str : strings) {
            System.out.println("Original: " + str);
            System.out.println("Reversed: " + reverseString(str));
            System.out.println();
        }
    }
}
