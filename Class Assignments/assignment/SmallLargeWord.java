package assignment;
//  4. Java Program to Find the Largest and Smallest Word in a String

public class SmallLargeWord {
    public static void main(String[] args) {
        String input = "Hello how are you, my name is Shreyash";
        String[] str = input.split(" ");
        String smallestWord = str[0];
        String largestWord = str[0];

        for (String word : str) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        System.out.println("The largest word is: " + largestWord);
        System.out.println("The smallest word is: " + smallestWord);
    }
}

