package linkedList;

import java.util.LinkedList;

public class Assign_15_45 {
	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		LinkedList<Integer>l2=new LinkedList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(41);
		
		System.out.println(l1.equals(l2));
	}
}
