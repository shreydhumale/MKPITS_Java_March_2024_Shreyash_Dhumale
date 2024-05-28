package JavaMethods;

public class MainClass {
    public static void main(String[] args) {
//        StringBuilder s1=new StringBuilder("Java");
//        s1.reverse();//to reverse the String
//        System.out.println("reversed String:");
//        s1.append("\n original String is:\n Java is an object oriented language.");
//        System.out.println(s1);

//       String s1="shhs";
//       String rev="";
//       for (int i=s1.length()-1;i>=0;i--){
//           rev=rev+s1.charAt(i);
//       }
//       if (s1.equals(rev)){
//           System.out.println("palindrome");
//       }
//       else {
//           System.out.println("not palindrome");
//       }
//

        int a=121121;
        int rev=0;
        int org=a;

        while (a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if (rev==org){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
        }
    }


