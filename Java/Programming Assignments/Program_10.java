package Programs;

import java.util.Scanner;

/* Write a Java program to convert days into Year, Months and Days */

public class Program_10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Convert days into years, months, and days
        int years = totalDays / 365;
        int days = totalDays % 365;
        int months = days / 30;
        int day1 = days % 30;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");

        scanner.close();
    }
}
