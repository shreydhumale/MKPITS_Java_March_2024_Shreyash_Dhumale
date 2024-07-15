package regex_java;

import java.util.regex.Pattern;

public class Regex_dot_Example {
public static void main(String[] args) {
	System.out.println(Pattern.matches(".a", "sa"));//true (2nd char is s)  
	
	System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s) 
	
	System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
	
	System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
	
	System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s) 
}
}
