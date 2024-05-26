package StringMismatch;

public class MainClass {
    static void compareStrings(String str1,String str2)throws StringMismatchException{
        if(!str1.equals(str2))
        {
            throw new StringMismatchException("Exception handled");
        }
    }
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        try {
            compareStrings(str1, str2);
        }catch (StringMismatchException e){
            System.out.println("Error"+e.getMessage());
        }

        System.out.println("Strings are equal.");
    }
}
