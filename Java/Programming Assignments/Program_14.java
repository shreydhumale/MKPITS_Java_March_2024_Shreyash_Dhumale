package Programs;

public class Program_14 {

    public static String reverseWords(String sentence) {
        String[] str = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : str) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String s1 = "Java is an object oriented language";
        System.out.println("Original Sentence: " + s1);
        
        String reversed = reverseWords(s1);
        System.out.println("Reversed Words Sentence: " + reversed);
    }
}
