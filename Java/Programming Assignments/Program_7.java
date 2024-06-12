package Programs;

import java.util.Scanner;

public class Program_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (N): ");
        
        int n= scanner.nextInt();

        double sum = Sum(n);

        System.out.println("Sum of the series :" + sum);
    }

    public static double Sum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) i / factorial(i);
        }
        return sum;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
