package JavaMethods;

public class MathClass {
    public static void main(String[] args) {
        // Math.sqrt-- returns square root
        float a=200;
        float SR= (int) Math.sqrt(a);
        System.out.println(SR);

        float ABS =Math.abs(a);
        System.out.println(ABS);

        float decrement=Math.decrementExact((int) a);
        System.out.println(decrement);
    }
}
