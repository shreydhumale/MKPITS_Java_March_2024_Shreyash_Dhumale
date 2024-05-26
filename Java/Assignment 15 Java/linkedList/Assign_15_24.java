package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Assign_15_24 {
	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		Iterator<Integer>iterator=l1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
