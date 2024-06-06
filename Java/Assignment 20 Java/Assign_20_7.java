package Assignment_20_Java;
import java.util.List;

public class Assign_20_7 {

  public static void main(String[] args) {
    List<String> names = List.of("a", "b", "c", "d", "e");

    long numberOfElements = names.stream()
        .count();

    System.out.println("Number of elements in the list: " + numberOfElements);
  }
}

