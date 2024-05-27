package Exceptions;

public class InvalidChoiceException extends Exception {
    public InvalidChoiceException() {
        super();
    }

    public InvalidChoiceException(String num1) {
        super(num1);
    }

    public static void getMethod(int num) throws InvalidChoiceException {
        if (num != 10) {
            throw new InvalidChoiceException("Invalid choice: " + num);
        }
    }
}
