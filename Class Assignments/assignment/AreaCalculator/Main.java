import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nChoose an option:");
            System.out.println("Press 1 to find the Area of Square");
            System.out.println("Press 2 to find the Area of Rectangle");
            System.out.println("Press 3 to find the Area of Circle");
            System.out.println("Press 4 to find the Area of Triangle");
            System.out.println("Press 5 to exit\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Area of Square: " + areaCalculator.areaOfSquare());
                    break;
                case 2:
                    System.out.println("Area of Rectangle: " + areaCalculator.areaOfRectangle());
                    break;
                case 3:
                    System.out.println("Area of Circle: " + areaCalculator.areaOfCircle());
                    break;
                case 4:
                    System.out.println("Area of Triangle: " + areaCalculator.areaOfTriangle());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
