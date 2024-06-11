package Programs;

import java.time.Year;
import java.util.Scanner;

public class Program_4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a year to check if it is leap year or not :");
		
		int year=scanner.nextInt();
		
		boolean isleapYear=Year.of(year).isLeap();//checks if the year is leap or not
		
		if(isleapYear) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year2");
		}
		scanner.close();
	}
}
