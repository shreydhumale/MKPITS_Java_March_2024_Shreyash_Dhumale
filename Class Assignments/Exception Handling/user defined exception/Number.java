package Exceptions;

import Exceptions.InvalidChoiceException;

public class Number {
    public static int num() throws InvalidChoiceException {
        int num = 15;
        try {
            if (num > 10) {
                System.out.println("Invalid Number");
                throw new InvalidChoiceException();
            }
        }
        catch (InvalidChoiceException e){
            System.out.println();
        }
        return num;
    }
}
