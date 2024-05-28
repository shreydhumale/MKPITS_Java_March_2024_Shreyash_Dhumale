//1. Java Program to Remove Characters from the Input String which are Present in the Mask String
//Input: Enter String: Practice Java String Programs
//Enter Mask String: abc
//Output: Prtie Jv String Progrms

//class Mainclass{
//    public static void main(String[] args) {
//        String str1="Practice Java String Programs";
//        String mask="abc";
//
//        StringBuilder sb=new StringBuilder();
//
//        for(int i = 0; i < str1.length(); i++) {
//            char ch = str1.charAt(i);
//            if(mask.indexOf(ch) == -1) {
//                sb.append(ch);
//            }
//        }
//
//        System.out.println("Output: " + sb.toString());
//    }
//}


//2. Java Program to Remove All Adjacent Duplicates from String
//Input: String: ABBCCCD
//Output: ACD

//class MainClass{
//    public static void main(String[] args) {
//        String str1="ABBCCCD";
//        StringBuilder sb=new StringBuilder();
//
//        // Iterate through each character of the string
//        for (int i=0; i<str1.length(); i++){
//            char currentChar = str1.charAt(i);
//
//            if (i == str1.length() - 1 || currentChar != str1.charAt(i + 1)) {
//                sb.append(currentChar);
//            } else {
//                i++;
//            }
//        }
//        System.out.println("Output: " + sb.toString());
//    }
//}


//3. Java Program to Reverse Each Word in a String
//Input: String: Java Programs on String
//Output: avaj smargorp no gnirts

//public class MainClass {
//    public static void main(String[] args) {
//        String s1 = "Java Programs on String";
//        String[] s2 = s1.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < s2.length; i++) {
//            sb.append(new StringBuilder(s2[i]).reverse());
//            if (i < s2.length - 1) {
//                sb.append(" ");
//            }
//        }
//        System.out.println(sb.toString());
//    }
//}

//4. Java Program to Find the Largest and Smallest Word in a String
//Input: Enter String: String Programs in Java
//Output: The largest and smallest word is “Programs” and “in”

//5. Java Program to Count the Number of Unique Words
//Input: Enter String: Java is great C++ is also great
//Output: Total number of unique words are 3

//6. Java Program to Implement the Monoalphabetic Cipher
//Input: Enter the message: Sanfoundry
//Output: Encrypted message: LQFYGXFRKN; Decrypted message: sanfoundry.

//7. Java Program to Implement Caesar Cipher
//Input: Enter the String for Encryption: Sanfoundry
//Output: vdqirxqgub


class MainClass {
    public static void sum(int... num) {
        int sum=0;
        System.out.println(num.length);
        for (int i:num){
            sum=sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(2, 4, 5, 6);

        }
    }

