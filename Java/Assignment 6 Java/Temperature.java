//2. Temperature Converter: Develop a program that converts temperatures between Celsius and Fahrenheit scales, allowing users to input a temperature in one scale and see the converted temperature in the other scale.

import java.util.Scanner;

public class Temperature {
    public double FarenheitToCelsius() {
        double celsius;
        System.out.println("Enter temperature in Farenheit: ");
        Scanner scanner = new Scanner(System.in);
        double farenheit = scanner.nextDouble();
        celsius = (farenheit-32)*5/9;
        System.out.println("After conversion: " +celsius+"C");
        System.out.println("*********************************************");
        return farenheit;
    }
    public double CelsiusToFarenheit(){
        double farenheit;
        System.out.println("Enter temperature in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        farenheit = (celsius*9/5)+32;
        System.out.println("After conversion: " + farenheit +"F");
        System.out.println("*********************************************");
        return celsius;
    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

            while (true){
            Scanner scanner = new Scanner(System.in);
            Temperature temperature = new Temperature();
            System.out.println("Choose ann option:");
            System.out.println("1.Farenheit to Celsius");
            System.out.println("2.Celsius to Farenheit");
            System.out.println("3.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    double farenheit;
                    farenheit = temperature.FarenheitToCelsius();
                    break;

                case 2:
                    double celsius;
                    celsius = temperature.CelsiusToFarenheit();
                    break;
                case 3:
                    System.out.println("EXiting.....");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
