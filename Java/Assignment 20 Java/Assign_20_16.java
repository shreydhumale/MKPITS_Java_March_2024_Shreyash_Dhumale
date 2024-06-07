package Assignment_20_Java;

import java.util.List;
import java.util.stream.Collectors;

public class Assign_20_16{

  public static void main(String[] args) {
    List<String> names = List.of("a", "b", "c", "d");

    List<String> remainingNames = names.stream()
        .skip(1) 
        .collect(Collectors.toList());

    System.out.println("Original list: " + names);
    System.out.println("List after skipping first element: " + remainingNames);
  }
}

