
package regex_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Example {
	public static void main(String[] args) {
		
		//three ways to write the regex  in Java.
		
		//1st way
		Pattern pattern=Pattern.compile(".s");
		Matcher matcher=pattern.matcher("as");
		boolean b =matcher.matches();
		System.out.println(b);
		
		
		//2nd way
		boolean b1=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b1);
		
		//3rd way
		boolean b2=Pattern.matches(".s","as");
		System.out.println(b2);
		
 
		
		
		
		
	}
}