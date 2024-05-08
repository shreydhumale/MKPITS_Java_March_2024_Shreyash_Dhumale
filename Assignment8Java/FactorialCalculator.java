2. Factorial Calculation:
   Write a Java program to calculate the factorial of a non-negative integer entered by the user. The program should use recursion to perform the factorial calculation.


package Assignment8Java;

class FactorialCalculator {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num
                + " is " + factorial(5));
    }
}
