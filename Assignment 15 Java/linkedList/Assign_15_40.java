package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Assign_15_40 {
	 public static void main(String[] args) {
			LinkedList<Integer>l1=new LinkedList<Integer>();
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(40);
			
			LinkedList<Integer>l2=new LinkedList<Integer>();
			l2=(LinkedList<Integer>) l1.clone();
			System.out.println(l2);
	}
}
