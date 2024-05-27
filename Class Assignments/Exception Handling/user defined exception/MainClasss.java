import Exceptions.InvalidChoiceException;
import Exceptions.Number;

//user defined exceptions
public class MainClasss {
    public static void main(String[] args) throws InvalidChoiceException {
        InvalidChoiceException.getMethod(10);
        System.out.println(Number.num());
        }
}
