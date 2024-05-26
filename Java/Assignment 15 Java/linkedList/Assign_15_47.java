package linkedList;

import java.util.LinkedList;

public class Assign_15_47 {
	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.set(0, 40);
		System.out.println(l1);
	}
}
