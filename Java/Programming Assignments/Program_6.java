package Programs;

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        
        //to print prime numbers from 1-100
        System.out.println("\nPrime numbers from 1 to 100:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime1 = true;
            if (i <= 1) {
                isPrime1 = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime1 = false;
                        break;
                    }
                }
            }
            if (isPrime1) {
                System.out.print(i + " ");
            }
        }
    }
}
 
