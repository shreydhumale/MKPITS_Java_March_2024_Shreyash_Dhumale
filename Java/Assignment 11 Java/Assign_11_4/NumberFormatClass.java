package NumberFormatException;

public class NumberFormatClass{
    public void checkString() {
        try {
        String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Exception handled");
        }
    }
}
