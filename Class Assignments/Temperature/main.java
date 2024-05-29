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
