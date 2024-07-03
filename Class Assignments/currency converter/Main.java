package currency_converter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Currency currency=new Currency();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount in USD: ");
		double amountUSD=scanner.nextDouble();
		double amountINR=currency.convertUSDtoINR(amountUSD);
		System.out.println(amountUSD+" USD"+ "=" + amountINR+" INR");

		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter amount in INR");
		double amountINR1=scanner2.nextDouble();
		double amountUSD1=currency.convertINRtoUSD(amountINR1);
		System.out.println(amountINR1+" INR"+ "=" +amountUSD1+" USD");
		
		Scanner scanner3=new Scanner(System.in);
		System.out.println("Enter amount in EURO");
		double amountEURO=scanner3.nextDouble();
		double amountINR2=currency.convertINRtoEURO(amountEURO);
		System.out.println(amountEURO+" INR =" + amountINR2+" EURO");
	}
}
