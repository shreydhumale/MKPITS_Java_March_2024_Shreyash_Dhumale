package CountFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyString {
    public static void File(String filename) throws IOException {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            lineCount++;//to count line
            String[] words = line.split("\\s+");
            wordCount += words.length;//to count words
            charCount += line.length();//to count characters
        }
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}







