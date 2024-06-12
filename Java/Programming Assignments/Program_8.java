package Programs;

import java.util.Scanner;

public class Program_8 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,4,4,4,5,6};
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		System.out.println(n+" occured "+count+ " times");
	}
}
