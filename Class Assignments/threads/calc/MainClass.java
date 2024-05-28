package Shapes;

public class MainClass {
    public static void main(String[] args) {
        Calculation calculation=new Calculation() {
            @Override
            public int addition(int a, int b) {
                return a+b;
            }

            @Override
            public int subtraction(int a, int b) {
                return a-b;
            }

            @Override
            public int multiplication(int a, int b) {
                return a*b;
            }

            @Override
            public int division(int a, int b) {
                return a/b;
            }
        };
        System.out.println(calculation.addition(10,20));
        System.out.println(calculation.subtraction(10,20));
        System.out.println(calculation.multiplication(10,20));
        System.out.println(calculation.division(10,20));
        }
    }
