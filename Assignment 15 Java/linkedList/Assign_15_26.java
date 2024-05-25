package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Assign_15_26 {
	public static void main(String[] args) {
	LinkedList<Integer>l1=new LinkedList<Integer>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	
	ListIterator<Integer>listIterator=l1.listIterator(l1.size());
	while(listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
	}
}
}
