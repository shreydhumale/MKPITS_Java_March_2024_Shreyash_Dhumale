package Programs;

import java.util.Scanner;

public class Program_5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a positive integer :");
		
		int n=scanner.nextInt();
		
		int sum=0;
		
		sum = n*(n+1)*(2*n+1)/6;
		
		System.out.println(sum);
	}
}
