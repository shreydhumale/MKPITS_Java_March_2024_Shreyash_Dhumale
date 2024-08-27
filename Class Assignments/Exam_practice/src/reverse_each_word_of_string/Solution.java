package reverse_each_word_of_string;

public class Solution {
    public String reverseString(String s) {
        String[] words = s.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
            
            result.append(reversedWord.toString());
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
		Solution solution = new Solution();
		String str="Hello How are you";
		System.out.println(solution.reverseString(str));
	}
}
