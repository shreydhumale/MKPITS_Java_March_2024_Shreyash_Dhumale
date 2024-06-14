package Programs;

import java.util.Scanner;

/* Write a Java program to convert Integer value into Binary*/

public class Program_11 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an Integer :");
		int integer=scanner.nextInt();
		
		String binary=Integer.toBinaryString(integer);
		
		System.out.println("binary conversion of "+integer +" is " +binary);
	}
}
