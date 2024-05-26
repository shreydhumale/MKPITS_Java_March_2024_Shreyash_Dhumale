package NumberFormatException;

import java.util.Scanner;

public class StringClass {
    public void stringIndex() {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a String");
            String str=scanner.next();
            char num = str.charAt(10);
            System.out.println(num);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Wrong Index number,Enter Index up to 3 ");
        }
    }
}
