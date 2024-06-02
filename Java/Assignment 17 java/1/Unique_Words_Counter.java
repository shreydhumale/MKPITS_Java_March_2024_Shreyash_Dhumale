package assignment_17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Unique_Words_Counter {
    public static void main(String[] args) {
        String filePath = "D:\\eclipse IDE\\JavaCollection\\collection\\src\\main\\java\\assignment_17";
        try {
            int uniqueWordCount = countUniqueWords(filePath);
            System.out.println("Total number of unique words: " + uniqueWordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countUniqueWords(String filePath) throws IOException {
        Set<String> uniqueWords = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String cleanedWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                    if (!cleanedWord.isEmpty()) {
                        uniqueWords.add(cleanedWord);
                    }
                }
            }
        }
        return uniqueWords.size();
    }
}

