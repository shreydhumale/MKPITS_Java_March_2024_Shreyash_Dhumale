package linkedList;

import java.util.LinkedList;

public class Assign_15_35 {
	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
	}
}
