package currency_converter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Enter 1 to convert USD to INR");
		System.out.println("Enter 2 to convert INR to USD");
		System.out.println("Enter 3 to convert INR to EURO");
		System.out.println("Enter 4 to exit ");
		Scanner sc=new Scanner(System.in);
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount in USD: ");
		double amountUSD=scanner.nextDouble();
		double amountINR=Currency.convertUSDtoINR(amountUSD);
		System.out.println(amountUSD+" USD"+ "=" + amountINR+" INR");
		break;
		
		case 2:
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter amount in INR");
		double amountINR1=scanner2.nextDouble();
		double amountUSD1=Currency.convertINRtoUSD(amountINR1);
		System.out.println(amountINR1+" INR"+ "=" +amountUSD1+" USD");
		break;
		
		case 3:
		Scanner scanner3=new Scanner(System.in);
		System.out.println("Enter amount in EURO");
		double amountEURO=scanner3.nextDouble();
		double amountINR2=Currency.convertINRtoEURO(amountEURO);
		System.out.println(amountEURO+" INR =" + amountINR2+" EURO");
		break;
		
		case 4:
			System.out.println("exiting...");
			return;
		}
		}
		}
		
}
