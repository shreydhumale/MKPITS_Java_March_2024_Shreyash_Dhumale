1. Palindrome Checker:
   Write a Java program to check if a given string is a palindrome or not. The program should take a string input from the user and output whether the string is a palindrome or not.


package Assignment8Java;

import java.util.Scanner;

class PalindromeStr {
    public static void main(String[] args) {
        {
            System.out.println("Enter any String");
            Scanner scanner = new Scanner(System.in);
            String str1 = scanner.next();
            String rev = "";

            for (int i = str1.length() - 1; i >= 0; i--) {
                rev = rev + str1.charAt(i);
            }
            if (str1.equals(rev)) {
                System.out.println("String is Palindrome");
            } else {
                System.out.println("String is not palindrome");
            }
        }
    }
}