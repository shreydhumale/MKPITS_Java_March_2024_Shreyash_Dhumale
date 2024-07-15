package regex_java;

import java.util.regex.Pattern;

public class Regex_Character_Classes_Example {
public static void main(String[] args) {
	
	System.out.println(Pattern.matches("[amn]", "abcdm"));////false (not a or m or n)  
	
	System.out.println(Pattern.matches("[amn]", "a"));////true (among a or m or n)  
	
	System.out.println(Pattern.matches("amn", "ammma"));////false (m and a comes more than once)  
}
}
