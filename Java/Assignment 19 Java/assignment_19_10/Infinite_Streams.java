package assignment_19_10;

import java.util.stream.IntStream;

public class Infinite_Streams {
	 public static void main(String[] args) {
		    IntStream randomStream = IntStream.generate(() -> (int) (Math.random() * 100)); 

		    randomStream = randomStream.limit(10);

		    randomStream.forEach(System.out::println);
		  }
}
