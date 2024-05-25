package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Assign_15_25 {
	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		ListIterator<Integer>listIterator=l1.listIterator(1);
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
