package CountFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Occurance {
    public static void countOccurances(String fname, String str) throws IOException {
        File src = new File(fname);
        if (src.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
                String str1 = bufferedReader.readLine();
                String[] words;
                int counter = 0;
                while (str1 != null) {
                    //System.out.println(str1);
                    words = str1.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        if (str.equals(words[i]))
                            counter++;
                    }
                    str1 = bufferedReader.readLine();
                }
                System.out.println("The number of time " + str + " repeated is " + counter);
                bufferedReader.close();
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        countOccurances("C:\\Threads\\abc.txt", "Shreyash");
    }
}
