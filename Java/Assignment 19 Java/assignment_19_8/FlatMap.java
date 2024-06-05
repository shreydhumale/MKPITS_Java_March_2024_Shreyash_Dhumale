package assignment_19_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(Arrays.asList(10,20,30));
        list.add(Arrays.asList(40,50,60));
        list.add(Arrays.asList(70,80,90));
        System.out.println("The list before flattening is : "+list);
         List a=  list.stream().flatMap(List::stream).collect(Collectors.toList());
          System.out.println(a);
    }
}