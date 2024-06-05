package assignment_19_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File_Processing {
	public static void main(String[] args) {
	    String filePath = "D:\\eclipse IDE\\JavaCollection\\com.Stream_api\\src\\abc.txt";

	    try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
	      // Process each line using the stream
	      lines.forEach(line -> processLine(line)); 
	      } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }

	  private static void processLine(String line) {
	    System.out.println("Processing line: " + line);
	  }
	}

