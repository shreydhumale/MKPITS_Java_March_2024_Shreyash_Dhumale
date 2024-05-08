5. Area Calculator: Build a program that calculates the area of basic geometric shapes like squares, rectangles, circles, and triangles based on user input.


import java.util.Scanner;

public class AreaCalculator {
    public float areaOfSquare(){
        System.out.println("Enter side of Square");
        Scanner scanner=new Scanner(System.in);
        int side=scanner.nextInt();
        float area=side*side;
        System.out.println("Area of Square=");
        return area;
    }
    public float areaOfRectangle(){
        System.out.println("Enter length of rectangle");
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        System.out.println("Enter width of rectangle");
        Scanner scanner1=new Scanner(System.in);
        int width=scanner.nextInt();
        float area=length*width;
        System.out.println("Area of rectangle=");
        return area;
    }
    public float areaOfCircle(){
        double pie= 3.14;
        System.out.println("Enter radius of circle");
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        System.out.println("Enter radius of circle");
        float area= (float) (pie*(radius*radius));
        System.out.println("Area of circle=");
        return area;
    }
    public float areaOfTriangle(){
        System.out.println("Enter base of triangle");
        Scanner scanner=new Scanner(System.in);
        int base=scanner.nextInt();
        System.out.println("Enter height of triangle");
        Scanner scanner1=new Scanner(System.in);
        int height=scanner.nextInt();
        float area=(base*height)/2;
        System.out.println("Area of triangle=");
        return area;
    }
}

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
