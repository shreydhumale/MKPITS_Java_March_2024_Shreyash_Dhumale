// 1. Calculator Application: Create a simple calculator program that can perform basic arithmetic operations like addition, subtraction, multiplication, and division.

code:-

import java.util.Scanner;

public class CalculatorApp {

    public int Add() {
        System.out.println("Addition");
        System.out.println("Enter 1st number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    public int Sub(){
        System.out.println("Subtraction");
        System.out.println("Enter 1st number:");
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        Scanner sc1=new Scanner(System.in);
        int num2= sc1.nextInt();
        int Sub=num1-num2;
        return Sub;
    }

    public int Mul(){
        System.out.println("Multiplication");
        System.out.println("Enter 1st number:");
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        Scanner sc1=new Scanner(System.in);
        int num2= sc1.nextInt();
        int mul=num1*num2;
        return mul ;
    }

    public int Div(){
        System.out.println("Division");
        System.out.println("Enter 1st number:");
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        Scanner sc1=new Scanner(System.in);
        int num2= sc1.nextInt();
        int div=num1/num2;
        return div;
    }
}


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorApp calculatorApp = new CalculatorApp();
        while (true) {
            System.out.println("*******************************************");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    int sum;
                    sum = calculatorApp.Add();
                    System.out.println("Sum: " + sum);
                    break;
                case 2:
                    int sub;
                    sub = calculatorApp.Sub();
                    System.out.println("Subtraction: " + sub);
                    break;
                case 3:
                    int mul;
                    mul = calculatorApp.Mul();
                    System.out.println("Multiplication: " + mul);
                    break;
                case 4:
                    int div;
                    div = calculatorApp.Div();
                    System.out.println("Division: " + div);
                    break;
                case 5:
                        System.out.println("Exiting....");
                        System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


